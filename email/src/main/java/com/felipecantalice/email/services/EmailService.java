package com.felipecantalice.email.services;

import com.felipecantalice.email.models.EmailModel;
import com.felipecantalice.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public void sendEmail(EmailModel model) {
    }
}
