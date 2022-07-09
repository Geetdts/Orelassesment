package com.assessment.userRegistration.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
//This class for Testing purpose for user login
public class HomeController {

    public String home(){
        return "this is Home Page";
    }
    public String admin(){
        return "this is Admin Page";
    }
}
