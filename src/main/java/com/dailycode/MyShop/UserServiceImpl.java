package com.dailycode.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo repo;

    @Override
    public void registerUser(User user) {
        repo.save(user);
    }

}
