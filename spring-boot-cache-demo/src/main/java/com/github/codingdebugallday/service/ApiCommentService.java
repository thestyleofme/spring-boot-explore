package com.github.codingdebugallday.service;

import java.time.Duration;
import java.util.Optional;

import com.github.codingdebugallday.pojo.Comment;
import com.github.codingdebugallday.repository.CommentRepository;
import com.github.codingdebugallday.utils.JsonUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/27 2:44
 * @since 1.0.0
 */
@Service
public class ApiCommentService {

    private static final String KEY = "comment:%d";
    private final CommentRepository commentRepository;
    private final RedisTemplate<String, String> redisTemplate;

    public ApiCommentService(CommentRepository commentRepository, RedisTemplate<String, String> redisTemplate) {
        this.commentRepository = commentRepository;
        this.redisTemplate = redisTemplate;
    }

    public Comment findCommentById(Long id) {
        String o = redisTemplate.opsForValue().get(String.format(KEY, id));
        if (o != null) {
            return JsonUtil.toObj(o, Comment.class);
        }
        Optional<Comment> optional = commentRepository.findById(id);
        if (optional.isPresent()) {
            Comment comment = optional.get();
            redisTemplate.opsForValue().set(String.format(KEY, id),
                    JsonUtil.toJson(comment), Duration.ofMinutes(1L));
            return comment;
        }
        return null;
    }


    public Comment updateComment(Comment comment) {
        commentRepository.updateComment(comment.getAuthor(), comment.getId());
        Optional<Comment> optional = commentRepository.findById(comment.getId());
        if (optional.isPresent()) {
            Comment result = optional.get();
            redisTemplate.opsForValue().set(String.format(KEY, comment.getId()),
                    JsonUtil.toJson(result), Duration.ofMinutes(1L));
            return result;
        }
        return null;
    }

    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
        redisTemplate.delete(String.format(KEY, id));
    }
}
