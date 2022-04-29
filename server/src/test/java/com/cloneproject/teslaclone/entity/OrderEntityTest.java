package com.cloneproject.teslaclone.entity;

import com.cloneproject.teslaclone.constant.ItemSellStatus;
import com.cloneproject.teslaclone.repository.ItemRepository;
import com.cloneproject.teslaclone.repository.MemberRepository;
import com.cloneproject.teslaclone.repository.OrderItemRepository;
import com.cloneproject.teslaclone.repository.OrderRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@Transactional
class OrderEntityTest {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    OrderItemRepository orderItemRepository;

    @Autowired
    MemberRepository memberRepository;

    @PersistenceContext
    EntityManager em;

    public Item createItem() {
        Item item = new Item();
        item.setItemNm("테스트 상품");
        item.setPrice(10000);
        item.setItemDetail("상세 설명 테스트");
        item.setItemSellStatus(ItemSellStatus.SELL);
        item.setStockNumber(100);
        item.setRegTime(LocalDateTime.now());
        item.setUpdateTime(LocalDateTime.now());
        return item;
    }

    @Test
    @DisplayName("Cascade(영속성전이) 테스트")
    public void cascadeTest() {
        OrderEntity orderEntity = new OrderEntity();
        for (int i = 0; i < 3; i++) {
            Item item = this.createItem();
            itemRepository.save(item);
            OrderItemEntity orderItemEntity = new OrderItemEntity();
            orderItemEntity.setItem(item);
            orderItemEntity.setCount(100);
            orderItemEntity.setOrderPrice(1990);
            orderItemEntity.setOrderEntity(orderEntity);
            orderEntity.getOrderItems().add(orderItemEntity);
        }
        orderRepository.saveAndFlush(orderEntity);
        em.clear();

        OrderEntity saveOrder = orderRepository.findById(orderEntity.getId()).orElseThrow(EntityNotFoundException::new);
        assertEquals(3, saveOrder.getOrderItems().size());
    }

    public OrderEntity createOrder(){
        OrderEntity order = new OrderEntity();
        for(int i=0;i<3;i++){
            Item item = createItem();
            itemRepository.save(item);
            OrderItemEntity orderItem = new OrderItemEntity();
            orderItem.setItem(item);
            orderItem.setCount(10);
            orderItem.setOrderPrice(1000);
            orderItem.setOrderEntity(order);
            order.getOrderItems().add(orderItem);
        }
        MemberEntity member = new MemberEntity();
        memberRepository.save(member);
        order.setMemberEntity(member);
        orderRepository.save(order);
        return order;
    }

    @Test
    @DisplayName("지연 로딩 테스트")
    public void lazyLoadingTest(){
        OrderEntity order = this.createOrder();
        Long orderItemId = order.getOrderItems().get(0).getId();
        em.flush();
        em.clear();
        OrderItemEntity orderItemEntity = orderItemRepository.findById(orderItemId)
                .orElseThrow(EntityNotFoundException::new);
        System.out.println("Order class : " + orderItemEntity.getOrderEntity().getClass());
        System.out.println("===========================");
        orderItemEntity.getOrderEntity().getOrderDate();
        System.out.println("===========================");
    }
}