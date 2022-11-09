package com.bmayes.ecommerce.dao;

import com.bmayes.ecommerce.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {

    Page<Order> findByCustomerEmailOrderByDateCreatedDesc(@Param("email") String email, Pageable pageabale);

    // behind the scenes Spring executes this query based on above method
    //
    // SELECT * FROM orders LET OUTER JOIN CUSTOMER ON orders.customer_id=customer.id WHERE customer.email=:email ORDER BY date_created DESC
    // where :email is the @Param

}
