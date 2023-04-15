package com.example.mobilele.config;

import com.example.mobilele.service.OfferService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

@Configuration
@EnableGlobalMethodSecurity
public class MobileleMethodSecurityConfig extends GlobalMethodSecurityConfiguration {
    private final OfferService offerService;

    public MobileleMethodSecurityConfig(OfferService offerService) {
        this.offerService = offerService;
    }

    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        return new MobileleSecurityExpressionHandler(offerService);
    }
}
