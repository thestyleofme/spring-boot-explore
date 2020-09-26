package com.github.codingdebugallday.repository;

import com.github.codingdebugallday.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/27 2:39
 * @since 1.0.0
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

    /**
     * 根据id修改作者
     *
     * @param author author
     * @param id     id
     * @return int
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Query(value = "update t_comment c set c.author = ?1 where c.id= ?2", nativeQuery = true)
    int updateComment(String author, Long id);
}
