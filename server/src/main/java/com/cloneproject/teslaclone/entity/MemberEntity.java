package com.cloneproject.teslaclone.entity;

import com.cloneproject.teslaclone.constant.AuthRole;
import com.cloneproject.teslaclone.dto.MemberDto;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Getter
@Setter
@ToString
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity extends AllTimeInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
    private String address;

    @Enumerated(EnumType.STRING)
    private AuthRole role;

    public static MemberEntity createMember(MemberDto memberDto, PasswordEncoder passwordEncoder) {
        MemberEntity member = new MemberEntity();
        member.setName(memberDto.getName());
        member.setEmail(member.getEmail());
        member.setAddress(memberDto.getAddress());
        String password = passwordEncoder.encode((memberDto.getPassword()));
        member.setPassword(password);
        member.setRole(AuthRole.USER);
//        member.setRole(AuthRole.ADMIN);
        return member;
    }

    public void memberUpdate(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}

