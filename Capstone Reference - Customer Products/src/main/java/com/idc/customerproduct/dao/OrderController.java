package com.idc.customerproduct.dao;

import com.idc.customerproduct.customer.CustomerModule;
import com.idc.customerproduct.customer.CustomerRepository;
import com.idc.customerproduct.customer.CustomerService;
import com.idc.customerproduct.product.ProductModule;
import com.idc.customerproduct.product.ProductRepository;
import com.idc.customerproduct.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerService customerService; // customer dependency injection

    @Autowired
    private ProductService productService; // product dependency injection

    @PostMapping("/placeOrder")
    public CustomerModule placeOrder(@RequestBody OrderRequest orderRequest) {
        CustomerModule customerModule = orderRequest.getCustomerModule();
        customerModule.getProductModules().forEach(p -> p.setCustomerModule(customerModule));
        return customerService.save(orderRequest.getCustomerModule());
    }

    @PostMapping("/order/addProduct")
    public ProductModule addProduct(@RequestBody ProductModule productModule) {
        productModule.getCustomerModule().setProductModules(List.of(productModule));
        return productService.save(productModule);
    }

    @PostMapping("/order/getCustomerByName")
    public String getCustomerByName(@RequestParam("name") String name) {
        return customerService.findByName(name).toString();
    }

    @PostMapping("/order/listCustomers")
    public List<CustomerModule> getList() {
        return customerService.findAll();
    }

    @GetMapping("/findAllOrders")
    public List<CustomerModule> findAllOrders() {
        return customerService.findAll();
    }


}
