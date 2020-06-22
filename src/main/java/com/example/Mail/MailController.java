package com.example.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {

    @Autowired
    MailService mailsService;

    @GetMapping(value = "/message")
    public String Message(){
        mailsService.sendSimpleMessage("","Mails Application","Hi! You received a message");
        return "Sent successfully";
    }

    @GetMapping(value = "/message/attachment")
    public String MessageWithAttachment() throws MessagingException {
        mailsService.sendMessageWithAttachment("","Mails Application with Attachment","Hi! You received an attachment");
        return "Attachments sent successfully";
    }
}
