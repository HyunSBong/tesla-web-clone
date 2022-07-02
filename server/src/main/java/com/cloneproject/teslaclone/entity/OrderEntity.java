package com.cloneproject.teslaclone.entity;

import com.cloneproject.teslaclone.config.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class OrderEntity extends AllTimeInfoEntity {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberEntity memberEntity;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus; // 주문 상태

    private LocalDateTime orderDate; // 주문일

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // 영속성 전이 설정 (cascade)
//    private List<OrderItemEntity> orderItems = new ArrayList<>(); // 하나의 주문이 여러 상품을 가짐
//    private LocalDateTime reqTime;
//    private LocalDateTime updateTime;

//    public void addOrderItem(OrderItem orderItem) {
//        orderItems.add(orderItem);
//        orderItem.setOrder(this);
//    }
//
//    public static Order createOrder(Member member, List<OrderItem> orderItemList) {
//        Order order = new Order();
//        order.setMember(member);
//
//        for(OrderItem orderItem : orderItemList) {
//            order.addOrderItem(orderItem);
//        }
//
//        order.setOrderStatus(OrderStatus.ORDER);
//        order.setOrderDate(LocalDateTime.now());
//        return order;
//    }
//
//    public int getTotalPrice() {
//        int totalPrice = 0;
//        for(OrderItem orderItem : orderItems){
//            totalPrice += orderItem.getTotalPrice();
//        }
//        return totalPrice;
//    }
//
//    public void cancelOrder() {
//        this.orderStatus = OrderStatus.CANCEL;
//        for (OrderItem orderItem : orderItems) {
//            orderItem.cancel();
//        }
//    }

}