package com.meuportifolio.course.repositories;

import com.meuportifolio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
