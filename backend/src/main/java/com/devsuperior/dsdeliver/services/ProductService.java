package com.devsuperior.dsdeliver.services;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> findAll() {
        List<Product> products = productRepository.findAllByOrderByNameAsc();
        return products.stream().map(product -> new ProductDTO(product)).collect(Collectors.toList());
    }
}
