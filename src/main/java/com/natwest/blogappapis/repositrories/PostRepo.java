package com.natwest.blogappapis.repositrories;

import com.natwest.blogappapis.entities.Category;
import com.natwest.blogappapis.entities.Post;
import com.natwest.blogappapis.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

//    @Query("select p from Post where p.title like :key")
//    List<Post> searchByTitle(@Param("key") String title);
    List<Post> searchByTitle(String title);
}
