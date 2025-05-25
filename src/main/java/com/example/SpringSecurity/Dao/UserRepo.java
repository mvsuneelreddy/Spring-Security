package com.example.SpringSecurity.Dao;

import com.example.SpringSecurity.Model.Usertb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<Usertb,Integer> {


    Usertb findByUsername(String username);
}
