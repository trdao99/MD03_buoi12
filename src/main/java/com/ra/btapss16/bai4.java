package com.ra.btapss16;

import com.ra.dao.ProductDao;
import com.ra.dto.ProdcutRequest;
import com.ra.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class bai4 {
    @RequestMapping("/bai4")
    public String bai4() {
        return "bai4";
    }

    @RequestMapping("/category")
    public String category(Model model) {
        CategoryService service = new CategoryService();
        model.addAttribute("list", service.getAllCategories());
        return "category";
    }

    @RequestMapping("/product")
    public String product(Model model) {
        ProductDao productDao = new ProductDao();
        model.addAttribute("list", productDao.getProducts());
        return "product";
    }

    @RequestMapping("/add")
    public String add(Model model) {
        CategoryService service = new CategoryService();
        model.addAttribute("category", service.getAllCategories());
        return "SaveProduct";
    }

    @PostMapping("/addNew")
    public String addNew(@ModelAttribute ProdcutRequest product) {
        ProductDao productDao = new ProductDao();
        try {
            productDao.saveProduct(product);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return  "redirect: /product";
    }
}
