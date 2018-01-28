package com.bishal.demo.SpringSwagger.service;

import com.bishal.demo.SpringSwagger.entity.Product;
import com.bishal.demo.SpringSwagger.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bishal Lama on 1/28/18.
 */
@Service(value = "productService")
public class ProductService {

    @Autowired
    ProductRepo productRepo;


    public Iterable<Product> listAllProducts() {
        return productRepo.findAll();
    }


    public Product getProductById(Long id) {
        return productRepo.findOne(id);
    }


    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }


    public void deleteProduct(Long id) {
        productRepo.delete(id);
    }
}
