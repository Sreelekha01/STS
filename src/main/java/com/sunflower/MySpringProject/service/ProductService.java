package com.sunflower.MySpringProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunflower.MySpringProject.entity.Product;
import com.sunflower.MySpringProject.repository.ProductRep;


@Service
public class ProductService {
	
	@Autowired
	private ProductRep repository;
	
	//post
	public  Product saveProduct( Product product) {
		
		return repository.save(product);
	}

	
   public  List<Product> saveProducts(List<Product> products) {
		
		return repository.saveAll(products);
		
		
	}
   
   
  //get
   public List<Product> getProducts(){
	   
	 return repository.findAll();  
   }

   
   public Product getProductsByID(int id){
	   
		 return repository.findById(id).orElse(null);  
	   }
   
   public Product getProductsByName(String name){
	   
		 return repository.findByName(name);  
	   }
 
   //delete
   
   public String deleteProduct(int id) {
	 repository.deleteById(id);
	 
	 return "product removed!!!!" +id;
	   
   }
   
   
   //update
   
   public Product updateProduct (Product product) {
	   
	   Product existingProduct = repository.findById(product.getId()).orElse(null);
	   existingProduct.setName(product.getName());
	   existingProduct.setQuantity(product.getQuantity());
	   existingProduct.setPrice(product.getPrice());
	   
	   return repository.save(existingProduct);
   }

}
