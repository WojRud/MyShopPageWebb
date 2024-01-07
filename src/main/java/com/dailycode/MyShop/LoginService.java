package com.dailycode.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repo;

    public UserLogin login(String email, String password) {
        UserLogin user = repo.findByEmailAndPassword(email, password);
        return user;
    }

}
