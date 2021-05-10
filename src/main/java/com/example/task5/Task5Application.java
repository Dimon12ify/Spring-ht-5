package com.example.task5;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

import javax.validation.*;
import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class Task5Application  implements CommandLineRunner {

    public static void main(String[] args) {
        var app = new SpringApplication(Task5Application.class);
        app.run(args);
    }

    @Override
    @Validated
    public void run(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("What is your birthday?");
        var birthday = LocalDate.parse(in.next());
        System.out.println("What is your name?");
        String name = in.next();
        System.out.println("What is your surname?");
        String sname = in.next();
        System.out.println("What is your sex?");
        Sex sex = Sex.valueOf(in.next());
        Person person = new Person(birthday, name, sname, sex);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        var violations = validator.validate(person);
        if (violations.isEmpty()) {
            System.out.println(">>>>>>>>>>>>> DATA IS VALID ");
        }
        for (ConstraintViolation<Person> violation : violations) {
            System.out.println("ERROR >>>>>>>>>  " + violation.getMessage());
        }
     }
}
