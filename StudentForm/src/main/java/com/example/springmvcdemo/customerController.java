package com.example.springmvcdemo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class customerController {


    @RequestMapping("/showForm")
    public String form(Model theModel) {

        //creating the customer


        theModel.addAttribute("customer", new Customer());
        return "customer-form";

    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {

        if (theBindingResult.hasErrors()) {

            return "customer-form";
        } else {
            System.out.println(theCustomer.getLastName());
            return "customer-confirmation";
        }


    }
}
