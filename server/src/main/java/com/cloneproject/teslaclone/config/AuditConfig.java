package com.cloneproject.teslaclone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // JPA Auditing
public class AuditConfig {
    // Audit 설정
    @Bean // AuditorAware Bean 등록
    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareCustomImpl();
    }
}
