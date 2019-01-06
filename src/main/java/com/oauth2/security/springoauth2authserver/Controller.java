package com.oauth2.security.springoauth2authserver;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test")

public class Controller {


    @GetMapping(value = "/rest/hallo")
    public String index(){

        return "Hello world";
    }

   




    


}
