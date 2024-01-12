package com.dailycode.MyShop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 //   Optional<User> findByEmail(String email);

  //  User findByEmail(String email);




    //////////////////////////////    ////////////////////////////////////////DODANO    ////////////////////////////////////////DODANO//////////DODANO
    User findByEmail(String email);
}
