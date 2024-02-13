package com.springboot.blog.service;

import com.springboot.blog.payload.PostDTO;
import com.springboot.blog.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);

    PostResponse getAllPosts(int pageSize, int pageNo, String sort, String sortDir);

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id);

    void deleteById(long postId);

    List<PostDTO> getPostsByCategory(Long categoryId);
}
