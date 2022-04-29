package com.cloneproject.teslaclone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditConfig {
    // Audit 설정
    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareCustomImpl();
    }
}
