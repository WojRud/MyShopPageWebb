package com.dailycode.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Scanner;

public interface UserService {

    List<User> getAllUsers();


    boolean isValidUser(String email, String password);
    void registerUser(User user);
    User findByEmail(String email);



}

