package com.cloneproject.teslaclone.service;

import com.cloneproject.teslaclone.entity.MemberEntity;
import com.cloneproject.teslaclone.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.security.NoSuchAlgorithmException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService implements UserDetailsService {

//    @Autowired
    private final MemberRepository memberRepository;

    public MemberEntity saveMember(MemberEntity member) {
        duplicationCheck(member);
        return memberRepository.save(member);
    }

    // 중복 회원 체크
    public void duplicationCheck(MemberEntity member) {
        MemberEntity findMember = memberRepository.findByEmail(member.getEmail());
        if (findMember != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        MemberEntity member = memberRepository.findByEmail(email);

        if (member == null) {
            throw new UsernameNotFoundException(email);
        }

        return User.builder()
                .username(member.getEmail())
                .password(member.getPassword())
                .roles(member.getRole().toString())
                .build();
    }

    // 회원가입
//    @Transactional
//    public Long join(MemberEntity member) throws NoSuchAlgorithmException {
//        MemberEntity memberEntity = member
//        MemberEntity findMember = memberRepository.findByEmail(memberEntity.getEmail());
//        if (findMember == null) {
//            memberRepository.save(memberEntity);
//            return memberEntity.getId();
//        } else{
//            return null;
//        }
//    }
}
