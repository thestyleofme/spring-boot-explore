package com.github.codingdebugallday.service;

import java.util.Optional;

import com.github.codingdebugallday.pojo.Comment;
import com.github.codingdebugallday.repository.CommentRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    /**
     * /@Cacheable将该方法的返回结果存放在spring boot默认缓存中
     * cacheNames：起一个缓存的命名空间（namespace） 对应缓存唯一标识
     * 默认 ConcurrentMapCacheManager
     * <p>
     * 缓存
     * value：返回结果
     * key：默认在只有一个参数的情况下，key值默认就是方法参数值
     * 如果没有参数或者多个参数的情况下，SimpleKeyGenerator
     */
    @Cacheable(cacheNames = "comment", unless = "#result==null")
    public Comment findCommentById(Long id) {
        Optional<Comment> optional = commentRepository.findById(id);
        return optional.orElse(null);
    }

    @CachePut(cacheNames = "comment", key = "#result.id")
    public Comment updateComment(Comment comment) {
        commentRepository.updateComment(comment.getAuthor(), comment.getId());
        return findCommentById(comment.getId());
    }

    @CacheEvict(cacheNames = "comment",key = "#id")
    public void deleteComment(Long id){
        commentRepository.deleteById(id);
    }
}
