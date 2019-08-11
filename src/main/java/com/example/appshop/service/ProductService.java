package com.example.appshop.service;



import com.example.appshop.domain.Product;
import com.example.appshop.dto.ProductDto;
import com.example.appshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.appshop.mapper.ProductMapper.toEntity;


@Service
public class ProductService {

    private ProductRepository productRepository;

@Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Transactional(readOnly = false)
    public void saveProduct(ProductDto productDto){
    Product product = toEntity(productDto);
    this.productRepository.save(product);
    }


    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Transactional(readOnly = false)
    public void deleteUserById(Long id) {
        this.productRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Product getById(Long id) {
        return productRepository.getOne(id);
    }

    @Transactional
    public void updateUser(ProductDto userDto) {
        productRepository.save(toEntity(userDto));
    }
}
