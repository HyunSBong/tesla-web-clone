package com.cloneproject.teslaclone.controller;

import com.cloneproject.teslaclone.dto.MemberDto;
import com.cloneproject.teslaclone.entity.MemberEntity;
import com.cloneproject.teslaclone.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class MemberControllerTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    PasswordEncoder passwordEncoder;

    public MemberEntity createMember(String email, String password) {
        MemberDto memberDto = new MemberDto();
        memberDto.setEmail(email);
        memberDto.setName("홍길동");
        memberDto.setAddress("대한민국");
        memberDto.setPassword(password);
        MemberEntity member= MemberEntity.createMember(memberDto, passwordEncoder);
        return memberService.saveMember(member);
    }

    @Test
    @DisplayName("로그인 성공 테스트")
    public void loginTest() throws Exception{
        String email = "test@test.co.kr";
        String password = "0101";
        this.createMember(email, password);
        mockMvc.perform(formLogin().userParameter("email")
                        .loginProcessingUrl("/account/login")
                        .user(email).password(password))
                .andExpect(SecurityMockMvcResultMatchers.authenticated());
    }

    @Test
    @DisplayName("로그인 실패 테스트 - 비밀번호 불일치")
    public void loginFailTest() throws Exception{
        String email = "test@test.co.kr";
        String password = "1234";
        this.createMember(email, password);
        mockMvc.perform(formLogin().userParameter("email")
                        .loginProcessingUrl("/account/login")
                        .user(email).password("0109"))
                .andExpect(SecurityMockMvcResultMatchers.unauthenticated());
    }
}