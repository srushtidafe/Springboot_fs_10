package org.geekster;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomMailAuthentication extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(MailMetaData.mailSender,MailMetaData.mailPassword);
    }

}