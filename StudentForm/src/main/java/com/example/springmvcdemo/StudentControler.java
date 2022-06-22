package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentControler {
    // video ends 5 text Fields write some codes
    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        //creat a student object
        Student theStudent = new Student();
        // add student object to the model

        theModel.addAttribute("student",theStudent);
         return "student-form";
    }

    @RequestMapping("/processForm")

    public String processForm(@ModelAttribute("student") Student theStudent){
        System.out.println("theStudent: "+ theStudent.getFirstName()+" " +theStudent.getLastName());
        return "student-confirmation";
    }


}
