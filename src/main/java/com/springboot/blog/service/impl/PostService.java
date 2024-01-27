package com.springboot.blog.service.impl;

import com.springboot.blog.payload.PostDTO;
import com.springboot.blog.payload.PostResponse;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);

    PostResponse getAllPosts(int pageSize, int pageNo, String sort, String sortDir);

    PostDTO getPostById(long id);

    PostDTO updatePost(PostDTO postDTO, long id);

    void deleteById(long postId);
}
