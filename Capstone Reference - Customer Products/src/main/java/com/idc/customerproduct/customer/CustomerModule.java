package com.idc.customerproduct.customer;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.idc.customerproduct.product.ProductModule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CustomerModule {
    @Id
    @SequenceGenerator(name = "customer_details_sequence", allocationSize = 1)
    @GeneratedValue(generator = "customer_details_sequence", strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "" )
    @JoinColumn(name = "cp_fk",referencedColumnName = "id")
    private List<ProductModule> productModules;
}
