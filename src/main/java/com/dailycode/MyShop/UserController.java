package com.dailycode.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user) {
        System.out.println(user);
        userService.registerUser(user);
        return "redirect:/login";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("user", new User());
        return "home";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/userLogin")
    public String loginUser(@ModelAttribute("user") User user) {
        if (userService.isValidUser(user.getEmail(), user.getPassword())) {
            return "schoolusers"; //////////////////////////////////////////////////////////ZMIANA NA "home"
        } else {
            return "login";
        }
    }

    @PostMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }


    @GetMapping("/account")
    public String showAccountProfile() {
        return "account";
    }

    @GetMapping("/myorders")
    public String showMyOrders() { return "myorders"; }

    @GetMapping("/editdata")
    public String showEditData() { return "editdata"; }

    @GetMapping("/fav")
    public String showFav() { return "fav"; }

    @GetMapping("/user")
    public String showUser() { return "user"; }

    @GetMapping("/basket")
    public String showBasket() { return "basket"; }

    @GetMapping("/show-data/{email}")
    @ResponseBody
    public String showData(@PathVariable String email, Model model) {
        User userFound = userService.findByEmail(email);
        if (userFound != null) {
            model.addAttribute("user", userFound);
            return "show-data/{email}";
        } else {
            return "error";
        }
    }


    private UserRepository userRepository;
/*
    @GetMapping("/user")
    public String getUserByEmail(@RequestParam String email) {
        User user = userRepository.findByEmail(email);
        if (user != null) {
            return "User name: " + user.getFirstName();
        } else {
            return "User not found";
        }
    }

 */



}
