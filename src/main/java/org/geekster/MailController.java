package org.geekster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

@RestController
public class MailController {
    @Autowired
    MailHandler mailHandler;

    @GetMapping("sendMail/sender/{sender}/password/{password}/receiver/{receiver}")
    public String sendMail(@PathVariable String sender, @PathVariable String password, @PathVariable String receiver) throws AddressException {
        MailMetaData.mailSender = sender;
        MailMetaData.mailPassword = password;
        MailMetaData.receiver = new InternetAddress(receiver);

        mailHandler.sendMail();

        return  "mail is Sent";
    }
}