package com.kodbook1.service;

import java.util.List;

import com.kodbook1.entities.Post;

public interface PostService {


	void createPost(Post post);
	
	List<Post> getAllPosts();

	List<Post> fetchAllPosts();

	Post getPost(Long id);

	void updatePost(Post post);
}
