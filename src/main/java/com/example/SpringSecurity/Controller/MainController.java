package com.example.SpringSecurity.Controller;


import com.example.SpringSecurity.Model.Usertb;
import com.example.SpringSecurity.Service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("api")
public class MainController {

    @Autowired
    UserServise service;


    @PostMapping("register")
    public Usertb adduser(@RequestBody Usertb user){
        return service.adduser(user);
    }

    @GetMapping("all")
    public List<Usertb> getall(){
        return service.getall();
    }

//    @PostMapping("login")
//    public void login(@RequestBody Usertb user){
//        service
//    }

}
