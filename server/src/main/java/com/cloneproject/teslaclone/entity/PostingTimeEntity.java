package com.cloneproject.teslaclone.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass
// 등록일, 수정일을 갖는 엔티티
public abstract class PostingTimeEntity {
    @CreatedDate // 엔티티 생성 시간 저장
    @Column(updatable = false)
    private LocalDateTime regTime;

    @LastModifiedDate // 엔티티 수정 시간 저장
    private LocalDateTime updateTime;

}
