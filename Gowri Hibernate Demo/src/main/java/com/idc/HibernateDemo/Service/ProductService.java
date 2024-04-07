package com.idc.HibernateDemo.Service;

import com.idc.HibernateDemo.Model.Product;
import com.idc.HibernateDemo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> productList) {
        return productRepository.saveAll(productList);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product searchByName(String name) {
        return productRepository.findByName(name);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public String deleteProduct(int id) {
        productRepository.delete(getProductById(id));
        return "product deleted successfully";
    }
}

//CRUD Repository implements basic crud operations (create, save, saveAll(), findById()
