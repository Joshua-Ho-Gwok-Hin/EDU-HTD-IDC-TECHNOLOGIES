package com.idc.customerproduct.dao;

import com.idc.customerproduct.customer.CustomerModule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

    private CustomerModule customerModule;

}
