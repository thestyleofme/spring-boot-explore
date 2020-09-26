package com.github.codingdebugallday.mapper;

import com.github.codingdebugallday.pojo.Article;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/26 22:38
 * @since 1.0.0
 */
// @Mapper
public interface ArticleMapper {

    /**
     * 根据id查询文章
     *
     * @param id id
     * @return Article
     */
    Article findById(Long id);
}
