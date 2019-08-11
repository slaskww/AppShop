package com.example.appshop.controllers;

import com.example.appshop.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddProductController {

    @RequestMapping("/addproduct")
    public String addProductView(Model model) {

        model.addAttribute("productDto", new ProductDto());

        return "add_product";
    }

    @RequestMapping("/display")
    public void displayThisShit(@ModelAttribute("productDto") ProductDto productDto, Model model){

        System.out.println( productDto.toString());

    }
}
