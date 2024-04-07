package com.idc.customerproduct.product;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.idc.customerproduct.customer.CustomerModule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ProductModule {

    @Id
    private int id;
    private String name;

    // Many Products to one customer.
    @ManyToOne
    @JoinColumn(name = "customer_id")
//    @JoinColumns({@JoinColumn(name = "customer_id"),@JoinColumn(name="name")})
    private CustomerModule customerModule;

}
