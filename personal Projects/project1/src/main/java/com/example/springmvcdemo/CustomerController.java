package com.example.springmvcdemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

   //creat a form display page
    @RequestMapping("login")
    public String login(Model model){
        //creat model and pass attribute on it that can be used in the login form
        //creat user object
       userData theUser = new userData();
       model.addAttribute("userData",theUser);



        return "login";
    }

    //processing the form

    @RequestMapping("/processForm")
    public String processForm(){
         //logic of validation




        return "Confirmation";
    }

   
}












