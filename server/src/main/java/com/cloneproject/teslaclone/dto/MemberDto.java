package com.cloneproject.teslaclone.dto;

//import com.cloneproject.teslaclone.entity.MemberEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
//@NoArgsConstructor
public class MemberDto {

    @NotBlank(message = "이름은 필수입니다.")
    private String name;

    @NotBlank(message = "이메일은 필수입니다.")
    private String email;

    @NotBlank(message = "비밀번호는 필수입니다.")
    private String password;

    @NotBlank(message = "주소는 필수입니다.")
    private String address;

//    public MemberDto(MemberEntity member) {
//        name = member.getName();
//        email = member.getEmail();
//        password = member.getPassword();
//    }
//
//    @Builder
//    public MemberDto(String name, String email, String password) {
//        this.name = name;
//        this.email = email;
//        this.password = password;
//    }
//
//    public MemberEntity toEntity() {
//        MemberEntity member = MemberEntity.builder()
//                .name(name)
//                .email(email)
//                .password(password)
//                .build();
//        return member;
//    }
}
