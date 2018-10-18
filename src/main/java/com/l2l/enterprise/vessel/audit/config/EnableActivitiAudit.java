package com.l2l.enterprise.vessel.audit.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableJpaRepositories({"org.activiti.cloud.services.audit.jpa"})
@EntityScan(
    basePackages = {"org.activiti.cloud.services.audit.jpa.events", "org.activiti.cloud.services.audit.jpa.events.model"}
)
@Inherited
//@EnableDiscoveryClient
//@EnableAutoConfiguration
//@EnableWebSecurity
public @interface EnableActivitiAudit {
}
