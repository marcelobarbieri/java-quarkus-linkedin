package com.barbieri.lq;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CommandRunner implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello Students");
        return 0;
    }
}
