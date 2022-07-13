package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentController {

    @RequestMapping("/showForm")
    public String studentForm(Model model) {
        //creat student object
        Student theStudent = new Student();

        //create a model
        model.addAttribute("student", theStudent);
        return "studentForm";
    }

    @RequestMapping("/processForm")
    public String processForm() {

        return "confirmationPage";
    }


}
