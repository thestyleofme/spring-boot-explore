package com.github.codingdebugallday.repository;

import com.github.codingdebugallday.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/26 23:04
 * @since 1.0.0
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {

}
