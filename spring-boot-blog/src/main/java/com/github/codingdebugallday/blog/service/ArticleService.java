package com.github.codingdebugallday.blog.service;

import com.github.codingdebugallday.blog.pojo.Article;
import com.github.codingdebugallday.blog.pojo.Page;
import org.springframework.data.domain.Pageable;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/28 10:10
 * @since 1.0.0
 */
public interface ArticleService {

    /**
     * 分页条件查询文章
     *
     * @param article  Article
     * @param pageable Pageable
     * @return Page<Article>
     */
    Page<Article> list(Article article, Pageable pageable);
}

