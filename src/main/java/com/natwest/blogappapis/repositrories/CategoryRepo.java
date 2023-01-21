package com.natwest.blogappapis.repositrories;

import com.natwest.blogappapis.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
