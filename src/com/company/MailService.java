package com.company;

public class MailService {
    public void sendEmail(){
        connect();
        authenticate();
        //send mail
        disConnect();
    }

    private void connect(){
        System.out.println("connected");
    }
    private void disConnect(){
        System.out.println("Disconnected");
    }
    private void authenticate(){
        System.out.println("Authenticated");
    }
}
