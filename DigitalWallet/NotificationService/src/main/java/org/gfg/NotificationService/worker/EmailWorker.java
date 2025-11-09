package org.gfg.NotificationService.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class EmailWorker {

    @Autowired
    JavaMailSender javaMailSender;

    public void sendEmail(String email, String name, String userIdentifier, String userIdentifierValue){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(email);
        simpleMailMessage.setText("");

        javaMailSender.send(simpleMailMessage);

    }
}
