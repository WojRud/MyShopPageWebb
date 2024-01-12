package com.dailycode.MyShop;


import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
    boolean isValidUser(String email, String password);
    void registerUser(User user);


    //////////////////////////////    ////////////////////////////////////////DODANO    ////////////////////////////////////////DODANO//////////DODANO
    User findByEmail(String email);

}