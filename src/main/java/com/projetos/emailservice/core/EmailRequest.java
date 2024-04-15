package com.projetos.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
}
