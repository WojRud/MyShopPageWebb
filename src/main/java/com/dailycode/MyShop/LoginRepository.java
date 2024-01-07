package com.dailycode.MyShop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<UserLogin, Long> {
    UserLogin findByEmailAndPassword(String email, String password);
}
