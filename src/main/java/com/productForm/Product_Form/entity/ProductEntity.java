package com.productForm.Product_Form.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_entity")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private String category;

    //Getter and Setter , Constructor , toString() will take Lombok dependency.

}
