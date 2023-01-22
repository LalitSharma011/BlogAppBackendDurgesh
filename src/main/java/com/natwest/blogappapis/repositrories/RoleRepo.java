package com.natwest.blogappapis.repositrories;

import com.natwest.blogappapis.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface RoleRepo extends JpaRepository<Role, Integer> {


}
