package com.example.springmvcdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstrainValidator implements ConstraintValidator<CourseCode,String> {

  private String coursePrefix;
    @Override
    public void initialize(CourseCode constraintAnnotation) {

        coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode , ConstraintValidatorContext theConstraintValidatorContext) {

        boolean result;
        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        } else {
            result = true; // user did not pass anything so the is nothing  to validate
        }


        return result;
    }
}
