package org.geekster;

import org.springframework.stereotype.Component;

import javax.mail.Address;

@Component
public class MailMetaData {
    private static final String hostServer = "smtp.gmail.com";

    public static String getHostServer() {
        return hostServer;
    }

    private static final String port = "465";

    public static String getPort() {
        return port;
    }

    private static final String sslProp = "mail.smtp.ssl.enable";

    public static String getSslProp() {
        return sslProp;
    }

    private static final String authProp = "mail.smtp.auth";

    public static String getAuthProp() {
        return authProp;
    }

    public  static String mailSender;
    public static  String mailPassword;

    public static Address receiver;


}