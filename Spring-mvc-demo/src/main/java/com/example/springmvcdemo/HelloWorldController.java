package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {

    //need a controller method to show the initial html form
    @RequestMapping("/showForm")
    public String showForm(){
       return "helloWorld-form";
    }
      // need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm(){


        return "processForm";
    }



    @RequestMapping("/processFormVersionTwo")

    public String letsShoutDude(HttpServletRequest request, Model model){

        //read the request parameter from the html form
        String theName = request.getParameter("studentName");
        String theFamilyName = request.getParameter("familyName");
        //convert data to all caps
        theName = theName.toUpperCase();
        theFamilyName = theFamilyName.toUpperCase();

        //create the message
        String result = "Yo! "+theName+" "+theFamilyName;
        System.out.println(result);
        //add messsage ie the result to the model
        model.addAttribute("message",result);

        return "processForm";



    }

}
