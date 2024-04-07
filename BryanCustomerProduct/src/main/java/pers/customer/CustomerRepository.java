package pers.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pers.dao.OrderResponse;

import java.util.List;

@Repository
interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new pers.dao.OrderResponse(c.name, p.name) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

//    @Query("SELECT * FROM customer_details WHERE ")


//    Customer findByName(String name);
}
