package com.ra.btapss16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class bai3 {
    @RequestMapping("/bai3")
    public String bai3() {
        return "bai3";
    }

    @PostMapping("/bai3")
    public String math(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam("math") String math, Model model) {
        switch (math) {
            case "+":
                model.addAttribute("rs", num1 + num2);
                break;
            case "-":
                model.addAttribute("rs", num1 - num2);
                break;
            case "*":
                model.addAttribute("rs", num1 * num2);
                break;
            case "/":
                model.addAttribute("rs", num1 / num2);
                break;
        }
        return "bai3";
    }
}
