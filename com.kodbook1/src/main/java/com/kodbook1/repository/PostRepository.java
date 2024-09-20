package com.kodbook1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodbook1.entities.Post;

public interface PostRepository 
				extends JpaRepository<Post, Long>{

}
