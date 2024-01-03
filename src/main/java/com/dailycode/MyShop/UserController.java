package com.dailycode.MyShop;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/home")
    public String register(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }



    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user) {

        System.out.println(user);

        return "home";
    }

}