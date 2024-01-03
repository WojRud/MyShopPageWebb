package com.dailycode.MyShop;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 */
@Entity
@Table(name="user")
public class User {

    private String name;
    @Id
    private String lastname;
    private String city;
    private String street;
    private String housenumber;
    private String postalcode;
    private String phone;
    private String email;
    private String password;

}
