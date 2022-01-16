package com.cloneproject.teslaclone.dto;

import com.cloneproject.teslaclone.entity.MemberEntity;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class MemberDto {

    private String name;
    private String email;
    private String password;

    public MemberDto(MemberEntity member) {
        name = member.getName();
        email = member.getEmail();
        password = member.getPassword();
    }

    @Builder
    public MemberDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public MemberEntity toEntity() {
        MemberEntity member = MemberEntity.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
        return member;
    }
}
