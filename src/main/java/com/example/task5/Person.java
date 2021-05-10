package com.example.task5;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
class Person {
    @NotNull(message = "Date is mandatory")
    @ValidDate
    LocalDate birthday;
    @NotBlank(message =  "Name is mandatory")
    @Length(max = 125, message = "Name length should be less then 125 symbols")
    String name;
    @Length(max = 150, message = "Surname length should be less then 150 symbols")
    String sname;
    @NotNull(message = "Sex is mandatory")
    Sex sex;

    public Person(LocalDate birthday, String name, String sname, Sex sex) {
        this.birthday = birthday;
        this.name = name;
        this.sname = sname;
        this.sex = sex;
    }
}

enum Sex {
    MALE,
    FEMALE
}
