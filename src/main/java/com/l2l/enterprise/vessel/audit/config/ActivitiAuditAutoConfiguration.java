package com.l2l.enterprise.vessel.audit.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({
    "org.activiti.cloud.services.audit",
    "org.activiti.cloud.alfresco",
    "org.activiti.spring",
  })
public class ActivitiAuditAutoConfiguration {
    public ActivitiAuditAutoConfiguration() {
        System.out.println("==ActivitiAuditAutoConfiguration==");
    }
}

