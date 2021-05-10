package com.example.task5;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.util.Date;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateValidator.class)
@Documented
public @interface ValidDate {
    String message() default "Date is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
 }
