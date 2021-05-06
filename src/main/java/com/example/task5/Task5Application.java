package com.example.task5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Task5Application  implements CommandLineRunner {

    public static void main(String[] args) {
        var app = new SpringApplication(Task5Application.class);
        app.run(args);
    }

    @Override
    public void run(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.next();
        System.out.println("Hello " + name + " welcome to spring boot" );
    }
}
