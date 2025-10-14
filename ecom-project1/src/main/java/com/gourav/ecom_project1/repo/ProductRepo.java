package com.gourav.ecom_project1.repo;

import com.gourav.ecom_project1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
