package com.idc.customerproduct.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModule, Integer> {

    @Query("SELECT new com.idc.customerproduct.customer(c.name, p.prdName) FROM CustomerModule c JOIN c.ProductModule p")
    public List<OrderResponse> getJoinInformation();
}
