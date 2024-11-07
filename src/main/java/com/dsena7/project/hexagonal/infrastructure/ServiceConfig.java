package com.dsena7.project.hexagonal.infrastructure;

import com.dsena7.project.hexagonal.application.UserUseCase;
import com.dsena7.project.hexagonal.domain.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public UserUseCase userService() {
        return new UserService();
    }
}
