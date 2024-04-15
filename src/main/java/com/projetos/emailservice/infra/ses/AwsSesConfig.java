package com.projetos.emailservice.infra.ses;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsSesConfig {

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        return AmazonSimpleEmailServiceClientBuilder.standard()
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                .withRegion("#") // Inserir a região da aws.
                .build();
    }
}