package com.cloneproject.teslaclone.repository;

import com.cloneproject.teslaclone.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
