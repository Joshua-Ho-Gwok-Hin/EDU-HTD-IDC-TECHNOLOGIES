package com.idc.HibernateDemo.Controller;

import com.idc.HibernateDemo.Model.Product;
import com.idc.HibernateDemo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
//    http://localhost:8080/add-product

    @PostMapping("/add-products-to-list")
    public List<Product> addMultipleProducts(@RequestBody List<Product> productList) {
        return productService.saveProducts(productList);
    }
//    http://localhost:8080/add-products-to-list

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.getProducts();
    }
//    http://localhost:8080/products

    @GetMapping("product/{id}")
    public Product findById(@PathVariable int id) {
        return productService.getProductById(id);
    }
//    http://localhost:8080/products/1

    @PutMapping("/update-product/{id}")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
//    http://localhost:8080/update-product/1

    @DeleteMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
//    http://localhost:8080//delete-product/1

}
