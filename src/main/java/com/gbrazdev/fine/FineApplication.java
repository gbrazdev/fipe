package com.gbrazdev.fine;

import com.gbrazdev.fine.start.Start;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FineApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Start start = new Start();
        start.exibeMenu();
    }

}
