package com.github.codingdebugallday.controller;

import com.github.codingdebugallday.pojo.Comment;
import com.github.codingdebugallday.service.CommentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/27 2:47
 * @since 1.0.0
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/{id}")
    public Comment findCommentById(@PathVariable Long id) {
        return commentService.findCommentById(id);
    }

}
