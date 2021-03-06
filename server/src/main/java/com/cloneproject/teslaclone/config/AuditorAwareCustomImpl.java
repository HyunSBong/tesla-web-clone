package com.cloneproject.teslaclone.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AuditorAwareCustomImpl implements AuditorAware<String> {
    // 로그인한 사용자의 정보를 등록자와 수정자로 지정하는 AuditorAware Interface
    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userId = "";
        if(authentication != null){
            userId = authentication.getName();
        }
        return Optional.of(userId);
    }

}
