package com.github.codingdebugallday.blog.mapper;

import java.util.List;

import com.github.codingdebugallday.blog.pojo.Article;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/28 10:00
 * @since 1.0.0
 */
public interface ArticleMapper {

    /**
     * 条件查询文章
     *
     * @param article     Article
     * @param startNumber startNumber
     * @param pageSize    pageSize
     * @return List<Article>
     */
    List<Article> list(@Param("article") Article article,
                       @Param("startNumber") int startNumber,
                       @Param("pageSize") int pageSize);

    /**
     * 查询文章总数
     *
     * @return Long
     */
    Long count();
}
