package com.ra.btapss16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Bai1 {
    @RequestMapping("/")
    public String home() {
        String home = "home";
        return home;
    }

    @RequestMapping("/bai1")
    public String bai1() {
        String bai1 = "bai1";
        return bai1;
    }

    @PostMapping("/bai1")
    public String exchange(@RequestParam("condiments") String[] Comdiments, Model model) {
        model.addAttribute("comdiments", Comdiments);
        return "bai1";
    }
}
