package com.telusko.ecom_proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.ecom_proj.model.Product;
import com.telusko.ecom_proj.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProduct() {
       return repo.findAll();

    }

    public Product getProduct(int id) {
       return repo.findById(id).get();
    }

    public String addProduct(Product product) {
         repo.save(product);
         return "Succes";
    }

    public String updateProduct(Product product) {
       repo.save(product);
       return "done";
    }

    public String deleteProduct(int id) {
       repo.deleteById(id);
       return "Done";
    }

   public List<Product> searchProducts(String keyword) {
     return repo.searchProducts(keyword);

   }

}
