package com.cloneproject.teslaclone.service;

import com.cloneproject.teslaclone.dto.MemberDto;
import com.cloneproject.teslaclone.entity.MemberEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public MemberEntity createMember() {
        MemberDto memberDto = new MemberDto();
        memberDto.setEmail("test@test.co.kr");
        memberDto.setName("홍길동");
        memberDto.setAddress("대한민국");
        memberDto.setPassword("0101");
        return MemberEntity.createMember(memberDto, passwordEncoder);
    }

    @Test
    @DisplayName("회원가입 테스트")
    public void saveMemberTest() {
        MemberEntity member = createMember();
        MemberEntity saveMember = memberService.saveMember(member);

        assertEquals(member.getEmail(), saveMember.getEmail());
        assertEquals(member.getName(), saveMember.getName());
        assertEquals(member.getAddress(), saveMember.getAddress());
        assertEquals(member.getPassword(), saveMember.getPassword());
        assertEquals(member.getRole(), saveMember.getRole());
    }

    @Test
    @DisplayName("중복 회원 가입 테스트")
    public void duplicationCheckTest() {
        MemberEntity member1 = createMember();
        MemberEntity member2 = createMember();
        memberService.saveMember(member1);

        Throwable e = assertThrows(IllegalStateException.class, () -> {
            memberService.saveMember(member2);
        });

        assertEquals("이미 가입되었습니다.", e.getMessage());
    }
}