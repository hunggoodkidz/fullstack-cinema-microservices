package com.topsquad.ninzy.notificationservice.service.abstracts;

import java.util.Map;

public interface EmailService {
    void sendEmail(String sender, String recipient, String subject, Map<String, String> model);
}
