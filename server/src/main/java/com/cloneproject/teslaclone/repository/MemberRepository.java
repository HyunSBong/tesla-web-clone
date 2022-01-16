package com.cloneproject.teslaclone.repository;

import com.cloneproject.teslaclone.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    public MemberEntity findByStudentId(String studentId);
}
