package com.cloneproject.teslaclone.service;

import com.cloneproject.teslaclone.dto.MemberDto;
import com.cloneproject.teslaclone.entity.MemberEntity;
import com.cloneproject.teslaclone.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.security.NoSuchAlgorithmException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    // 중복 회원 체크
    public boolean duplicationCheck(MemberDto memberDto) {
        MemberEntity findMember = memberRepository.findByStudentId(memberDto.toEntity().getEmail());
        if (findMember == null) {
            return true;
        } else {
            return false;
        }
    }

    // 회원가입
    @Transactional
    public Long join(MemberDto memberDto) throws NoSuchAlgorithmException {
        MemberEntity memberEntity = memberDto.toEntity();
        MemberEntity findMember = memberRepository.findByStudentId(memberEntity.getEmail());
        if (findMember == null) {
            memberRepository.save(memberEntity);
            return memberEntity.getId();
        } else{
            return null;
        }
    }
}
