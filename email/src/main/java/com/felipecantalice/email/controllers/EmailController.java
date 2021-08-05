package com.felipecantalice.email.controllers;

import com.felipecantalice.email.dtos.EmailDTO;
import com.felipecantalice.email.models.EmailModel;
import com.felipecantalice.email.services.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    public ResponseEntity<EmailModel> sendEmail(@RequestBody @Valid EmailDTO emailDTO){
        EmailModel model = new EmailModel();
        BeanUtils.copyProperties(emailDTO,model);
        emailService.sendEmail(model);
        return new ResponseEntity<>(model, HttpStatus.CREATED);
    }

}
