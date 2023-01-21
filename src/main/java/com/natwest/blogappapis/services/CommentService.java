package com.natwest.blogappapis.services;

import com.natwest.blogappapis.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);
    void deleteComment(Integer commentId);

}
