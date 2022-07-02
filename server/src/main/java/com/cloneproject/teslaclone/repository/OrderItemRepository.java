package com.cloneproject.teslaclone.repository;

import com.cloneproject.teslaclone.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long> {
}
