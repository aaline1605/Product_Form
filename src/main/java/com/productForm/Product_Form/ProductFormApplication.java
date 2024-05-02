package com.productForm.Product_Form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductFormApplication.class, args);
	}

}




/*
  CONSOLE

--> Hibernate: insert into product_entity (category,name,price) values (?,?,?)
--> Hibernate: select pe1_0.id,pe1_0.category,pe1_0.name,pe1_0.price from product_entity pe1_0
--> Hibernate: insert into product_entity (category,name,price) values (?,?,?)
--> Hibernate: select pe1_0.id,pe1_0.category,pe1_0.name,pe1_0.price from product_entity pe1_0


 */