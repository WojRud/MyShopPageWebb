package com.dailycode.MyShop;

import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
    boolean isValidUser(String email, String password);

    public void registerUser(User user);
}
