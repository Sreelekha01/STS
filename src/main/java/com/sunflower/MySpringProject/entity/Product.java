package com.sunflower.MySpringProject.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="PRODUCT_TL")

public class Product {

	@Id
    @GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private double price;

}
