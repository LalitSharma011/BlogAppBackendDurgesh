package com.natwest.blogappapis.repositrories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.natwest.blogappapis.entities.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
