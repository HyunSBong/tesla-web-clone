package com.cloneproject.teslaclone.entity;

import com.cloneproject.teslaclone.dto.MemberDto;
import com.cloneproject.teslaclone.repository.CartRepository;
import com.cloneproject.teslaclone.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class CartEntityTest {
    @Autowired
    CartRepository cartRepository;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PersistenceContext
    EntityManager em;

    public MemberEntity createMember() {
        MemberDto memberDto = new MemberDto();
        memberDto.setEmail("test@test.co.kr");
        memberDto.setName("홍길동");
        memberDto.setAddress("대한민국");
        memberDto.setPassword("0101");
        return MemberEntity.createMember(memberDto, passwordEncoder);
    }

    @Test
    @DisplayName("장바구니 회원 엔티티 매핑 조회 테스트 - 일대일")
    public void findCartAndMemberTest() {
        MemberEntity member = createMember();
        memberRepository.save(member);

        CartEntity cartEntity = new CartEntity();
        cartEntity.setMemberEntity(member);
        cartRepository.save(cartEntity);

        em.flush();
        em.clear();

        CartEntity savedCart = cartRepository.findById(cartEntity.getId())
                .orElseThrow(EntityNotFoundException::new);
        assertEquals(savedCart.getMemberEntity().getId(), member.getId());
    }
}