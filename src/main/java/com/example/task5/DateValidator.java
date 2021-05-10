package com.example.task5;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.util.Date;

public class DateValidator implements ConstraintValidator<ValidDate, LocalDate> {
    public void initialize(ValidDate constraint) {
    }

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        var dateNow = LocalDate.now();
        return value.isBefore(dateNow) && value.isAfter(dateNow.minusYears(100));
    }
}