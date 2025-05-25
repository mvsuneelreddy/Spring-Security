package com.example.SpringSecurity.Service;


import com.example.SpringSecurity.Model.Usertb;
import com.example.SpringSecurity.Dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServise {


    PasswordEncoder encoder =new BCryptPasswordEncoder(10);

    @Autowired
    UserRepo repo;


    public Usertb adduser(Usertb user) {
        user.setPassword(encoder.encode(user.getPassword()));
       return repo.save(user);
    }

    public List<Usertb> getall() {
        return repo.findAll();
    }
}
