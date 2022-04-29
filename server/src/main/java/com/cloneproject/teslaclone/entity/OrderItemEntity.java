package com.cloneproject.teslaclone.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class OrderItemEntity {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;

    private int orderPrice;
    private int count;
    private LocalDateTime reqTime;
    private LocalDateTime updateTime;

    public int getTotalPrice(){
        return orderPrice*count;
    }

//    public void cancel() {
//        this.getItem().addStock(count);
//    }
}
