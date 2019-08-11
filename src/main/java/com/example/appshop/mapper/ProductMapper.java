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
        product.setName(productDto.getName());

        return product;
    }

    public static ProductDto toDto(Product product){

        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setCategory(product.getCategory());
        productDto.setDescription(product.getDescription());
        productDto.setGroup(product.getGroup());
        productDto.setPrice(product.getPrice());
        productDto.setName(product.getName());

        return productDto;
    }

}
