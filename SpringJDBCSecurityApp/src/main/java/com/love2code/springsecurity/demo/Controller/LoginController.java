package com.love2code.springsecurity.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){

        ///return "plain-login";
        return "fancy-login";
    }

    @GetMapping("/leaders")
    public String showLeadersPage(){

        ///return "plain-login";
        return "leaders";
    }

    //add request mappings for /systems

    @GetMapping("/systems")
    public String showSystemPage(){

        ///return "plain-login";
        return "systems";
    }

    //creating the access denied page
    @GetMapping("access-denied")
    public String showAccessDenied(){

        return "access-denied";
    }


}
