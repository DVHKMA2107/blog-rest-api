package com.springboot.blog.service.impl;

import com.springboot.blog.payload.CommentDTO;

import java.util.List;
import java.util.Set;

public interface CommentService {
    CommentDTO createComment(long postId, CommentDTO commentDTO);

    List<CommentDTO> getAllComment(long postId);

    CommentDTO getCommentById(long postId, long commentId);

    CommentDTO updateCommentById(long postId, long commentId, CommentDTO comment);

    void deleteComment(long postId, long commentId);
}
