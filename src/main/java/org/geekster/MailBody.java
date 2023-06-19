package org.geekster;

import org.springframework.stereotype.Component;

@Component
public class MailBody {
    public MailBody() {
        System.out.println("object of MailBody Is Created");
    }

    public  String mailSubject = "Sending Mail using Java";
    public  String mailBody = "Hello Guys..I want you draw your Attention to the fact that I have learned Go to send mail using java And now I am Sending Mail Using Java";
}