package com.meuportifolio.course.repositories;

import com.meuportifolio.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // optional annotation
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
