package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller

public class HomeController {
    @GetMapping("/songform")

    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());
        return "songform";
    }
    @PostMapping("/songform")
    public String loadFormPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song", song);
        return "confirmsong";
    }
}
