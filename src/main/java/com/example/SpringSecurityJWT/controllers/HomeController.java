package com.example.SpringSecurityJWT.controllers;

//import com.example.SpringSecurityJWT.entities.User;
//import com.example.SpringSecurityJWT.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping()
    public String usersPage(){
        return "Welcome to the Dashboard!";
    }

}
