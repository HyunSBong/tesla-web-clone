package com.cloneproject.teslaclone.controller;

import com.cloneproject.teslaclone.dto.MemberDto;
import com.cloneproject.teslaclone.entity.MemberEntity;
import com.cloneproject.teslaclone.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@Controller
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("api/auth")
public class MemberController {

    private final MemberService memberService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/signup")
    public String signUp(Model model) {
        model.addAttribute("memberDto", new MemberDto());
        return "/account/signup";
    }

    @PostMapping("/signup")
    public String signUpPost(@Valid @ModelAttribute MemberDto memberDto, BindingResult bindingResult, Model model) throws Exception {
        // error 확인
        if (bindingResult.hasErrors()) {
            return "/account/signup";
        }
        try {
            MemberEntity member = MemberEntity.createMember(memberDto, passwordEncoder);
            memberService.saveMember(member);
        } catch (IllegalStateException e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "/account/signup";
        }
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "/account/login";
    }

    @GetMapping("/login/error")
    public String loginError(Model model) {
        model.addAttribute("LoginErrorMessage", "아이디 또는 비밀번호가 올바르지 않습니다.");
        return "/account/login/error";
    }



//    public String signUpPost(@Valid @ModelAttribute MemberDto memberDto, BindingResult bindingResult) throws Exception {
//        // error 확인
//        if (bindingResult.hasErrors()) {
//            return "/account/signup";
//        }
//        // error가 없을 경우, 이메일에 대한 중복확인 후 리다이렉트
//        else {
//            if (memberService.duplicationCheck(memberDto)) {
//                memberService.join(memberDto);
//            }
//        }
//        return "redirect:login";
//    }

}
