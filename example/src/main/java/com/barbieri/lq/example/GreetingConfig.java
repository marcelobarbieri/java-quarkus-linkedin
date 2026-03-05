package com.barbieri.lq.example;

import jakarta.enterprise.context.ApplicationScoped;

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
