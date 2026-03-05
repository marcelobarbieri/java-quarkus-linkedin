package com.barbieri.lq.example;

@ApplicationScoped
public class GreetingConfig {

    String receipient = "LinkedIn Learning Students";

    public String getReceipient() {
        return receipient;
    }

    public void setReceipient(String receipient) {
        this.receipient = receipient;
    }

}
