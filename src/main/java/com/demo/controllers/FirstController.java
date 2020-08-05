package com.demo.controllers;

import com.demo.model.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping(value = "/getQuote")
    public String getQuote(Model model) {

        model.addAttribute("randomQuote", "hello.....");
        return "quote";
    }

    @RequestMapping(value = "/home")
    public String getHome(Model model) {
        return "home";
    }

    @RequestMapping(value = "/createAccount")
    public String createAccount(@ModelAttribute("newaccount") Account account) {
        return "createAccount";
    }

}
