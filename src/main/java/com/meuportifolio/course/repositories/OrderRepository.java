package com.meuportifolio.course.repositories;

import com.meuportifolio.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // optional annotation
public interface OrderRepository extends JpaRepository<Order, Long> {

}
