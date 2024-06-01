package com.dailycode.MyShop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService {
    boolean isValidUser(String email, String password);
    void registerUser(User user);
    User findByEmail(String email);

}

