package com.dailycode.MyShop;

import jakarta.persistence.*;
import lombok.Setter;

/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Setter
    private String lastname;

    private String city;
    private String street;
    private String housenumber;
    private String postalcode;
    private String phone;
    private String email;
    private String password;

}
