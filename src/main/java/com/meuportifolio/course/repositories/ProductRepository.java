package com.meuportifolio.course.repositories;

import com.meuportifolio.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
