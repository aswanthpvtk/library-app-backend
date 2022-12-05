package com.nest.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class librarycontroller {

    @PostMapping("/")
    public String Adminlogin()
    {
        return " welcome to admin login page";
    }

    @PostMapping("/userreg")
    public String Userreg()
    {
        return " welcome to user reg page";
    }


}
