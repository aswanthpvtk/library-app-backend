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

    @PostMapping("/userlog")
    public String Userlog()
    {
        return " welcome to user login page";
    }

    @PostMapping("/entry")
    public String Bookentry()
    {
        return " welcome to book entry page";
    }

    @GetMapping("/view")
    public String Bookview()
    {
        return " welcome to book view page";
    }


    @PostMapping("/search")
    public String Booksearch()
    {
        return " welcome to book search page";
    }

    @PostMapping("/editb")
    public String Bookedit()
    {
        return " welcome to book edit page";
    }


}
