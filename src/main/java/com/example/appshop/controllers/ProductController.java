package com.example.appshop.controllers;

import com.example.appshop.dto.ProductDto;
import com.example.appshop.mapper.ProductMapper;
import com.example.appshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class ProductController {

    private ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = {"/addproduct", "/"})
    public String addProductView(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "add_product";
    }
    

    @RequestMapping("/display")
    public String saveProduct(@Valid @ModelAttribute("productDto") ProductDto productDto, Model model){ //atrybut przychodzi postem z add_product.jsp

        if (productDto.getId() == null){ //jesli id==null to mamy do czynienia z nowo utworzonym ProductDto
            this.productService.saveProduct(productDto);
        } else{ //jesli id != null, to mamy do czynienia z ProductDto mapującym Product istniejący w DB
            this.productService.updateUser(productDto);
        }

        model.addAttribute("products", this.productService.findAll());
        return "show_products";
    }

    @RequestMapping("/deleteProduct")
    public String deleteProduct(@ModelAttribute("id") Long id, Model model){

        this.productService.deleteUserById(id);

        model.addAttribute("products", this.productService.findAll());
        return "show_products";
    }

    @RequestMapping("/editProduct")
    public String updateProduct(@ModelAttribute("id") Long id, Model model){

        model.addAttribute("productDto", ProductMapper.toDto(this.productService.getById(id)));
        return "add_product";
    }
}
