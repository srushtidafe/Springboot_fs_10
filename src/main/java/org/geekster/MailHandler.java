package org.geekster;

import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.*;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public  class  MailHandler {
    @Autowired
    MailBody mailBody;
    public MailHandler() {
        System.out.println("Object of MailHandler is Created");
    }


    public void sendMail() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", MailMetaData.getHostServer());
        properties.put("mail.smtp.port", MailMetaData.getPort());
        properties.put(MailMetaData.getSslProp(), true);
        properties.put(MailMetaData.getAuthProp(), true);
        Authenticator authenticator = new CustomMailAuthentication();
        Session session = Session.getInstance(properties, authenticator);
        MimeMessage message = new MimeMessage(session);
        try{
            message.setFrom(MailMetaData.mailSender);
            message.setSubject(mailBody.mailSubject);
            message.setText(mailBody.mailBody);
            message.setRecipient(Message.RecipientType.TO,MailMetaData.receiver);
            Transport.send(message);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}