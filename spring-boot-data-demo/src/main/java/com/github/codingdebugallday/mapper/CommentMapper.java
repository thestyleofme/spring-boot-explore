package com.github.codingdebugallday.mapper;

import com.github.codingdebugallday.pojo.Comment;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/26 22:23
 * @since 1.0.0
 */
// @Mapper
public interface CommentMapper {

    /**
     * 根据id查询评论
     *
     * @param id id
     * @return Comment
     */
    @Select("select * from t_comment where id = #{id}")
    Comment findById(Long id);
}
