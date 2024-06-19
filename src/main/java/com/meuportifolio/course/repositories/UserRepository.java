package com.meuportifolio.course.repositories;

import com.meuportifolio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // optional annotation
public interface UserRepository extends JpaRepository<User, Long> {

}
