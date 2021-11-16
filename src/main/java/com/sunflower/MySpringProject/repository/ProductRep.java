package com.sunflower.MySpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sunflower.MySpringProject.entity.Product;

public interface ProductRep  extends JpaRepository<Product, Integer>{

	Product findByName(String name);
}
