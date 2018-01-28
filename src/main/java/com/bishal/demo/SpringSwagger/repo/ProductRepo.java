package com.bishal.demo.SpringSwagger.repo;

import com.bishal.demo.SpringSwagger.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Bishal Lama on 1/28/18.
 */
public interface ProductRepo extends JpaRepository<Product, Long> {
}
