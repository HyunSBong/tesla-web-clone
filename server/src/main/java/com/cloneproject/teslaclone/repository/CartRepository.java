package com.cloneproject.teslaclone.repository;

import com.cloneproject.teslaclone.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
}
