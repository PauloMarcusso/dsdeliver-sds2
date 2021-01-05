package com.devsuperior.dsdeliver.controllers;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.repositories.ProductRepository;
import com.devsuperior.dsdeliver.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> listar(){
        List<ProductDTO> products = productService.findAll();
        return ResponseEntity.ok().body(products);
    }
}
