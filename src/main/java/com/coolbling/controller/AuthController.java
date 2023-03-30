package com.coolbling.controller;
import com.coolbling.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // handler method to handle home page request
    @GetMapping("/index")
    public String home(){
        return "index";
    }


    @GetMapping("/register")
    public String login(Model model) {
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";}


}