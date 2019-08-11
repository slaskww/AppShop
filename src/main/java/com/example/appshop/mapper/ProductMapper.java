package com.example.appshop.mapper;

import com.example.appshop.domain.Product;
import com.example.appshop.dto.ProductDto;

public class ProductMapper {

    public static Product toEntity(ProductDto productDto){

        Product product = new Product();
        product.setId(productDto.getId());
        product.setCategory(productDto.getCategory());
        product.setDescription(productDto.getDescription());
        product.setGroup(productDto.getGroup());
        product.setPrice(productDto.getPrice());

        return product;
    }

}
