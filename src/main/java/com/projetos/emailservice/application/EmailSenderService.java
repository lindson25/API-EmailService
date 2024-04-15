package com.projetos.emailservice.application;

import com.projetos.emailservice.adapters.EmailSenderGateway;
import com.projetos.emailservice.core.EmailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUserCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway) {
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
