package com.example.springmvcdemo;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    // video ends 1. Spring MVC Form Validation Overview
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        //creat a student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);
        return "student-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "student-form";
        } else {
            // can register student to the database using getFirstName and getLastName
            return "student-confirmation";
        }


    }


}
