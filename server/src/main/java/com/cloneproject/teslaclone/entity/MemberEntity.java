package com.cloneproject.teslaclone.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "email")
    private String email;
    private String password;
    private String name;

    @Builder
    public MemberEntity(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public void memberUpdate(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}

