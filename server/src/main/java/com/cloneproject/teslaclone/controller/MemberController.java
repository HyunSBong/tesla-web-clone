package com.cloneproject.teslaclone.controller;

import com.cloneproject.teslaclone.dto.MemberDto;
import com.cloneproject.teslaclone.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
//@RequestMapping("api/auth")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/signup")
    public String signUp(MemberDto dto) {
        return "/account/signup";
    }

    @PostMapping("/signup")
    public String signUpPost(@Valid @ModelAttribute MemberDto memberDto, BindingResult bindingResult) throws Exception {
        // error 확인
        if (bindingResult.hasErrors()) {
            return "/account/signup";
        }
        // error가 없을 경우, 이메일에 대한 중복확인 후 리다이렉트
        else {
            if (memberService.duplicationCheck(memberDto)) {
                memberService.join(memberDto);
            }
        }
        return "redirect:login";
    }

}
