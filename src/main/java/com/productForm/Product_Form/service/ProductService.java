package com.productForm.Product_Form.service;

import com.productForm.Product_Form.entity.ProductEntity;
import com.productForm.Product_Form.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //Method to add new product to database
    public void saveTheProduct(ProductEntity productEntity){
         productRepository.save(productEntity);
    }

    //Method to display Product from Database
    public List<ProductEntity> getAllProduct(){
        return productRepository.findAll();
    }


}
