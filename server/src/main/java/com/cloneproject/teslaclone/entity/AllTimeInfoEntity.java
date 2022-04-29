package com.cloneproject.teslaclone.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Getter
@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass
// 등록일, 수정일, 등록자, 수정자 정보를 모두 갖는 엔티티
public abstract class AllTimeInfoEntity extends PostingTimeEntity {

    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;

}
