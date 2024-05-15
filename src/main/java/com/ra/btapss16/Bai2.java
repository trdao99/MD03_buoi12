package com.ra.btapss16;

import com.ra.entity.Employee;
import com.ra.services.bai2Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Bai2 {
@RequestMapping("/bai2")
    public String bai2(Model model){
    bai2Service bai2Service = new bai2Service();
        List<Employee> employees = bai2Service.getEmployees();
        model.addAttribute("list", employees);
    return "bai2";
}
}
