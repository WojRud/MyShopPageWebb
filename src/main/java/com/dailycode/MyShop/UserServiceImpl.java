package com.dailycode.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public boolean isValidUser(String email, String password) {
        // Retrieve user by email and check the password
        User user = userRepo.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }

    @Override
    public void registerUser(User user) {
        userRepo.save(user);
    }

}
