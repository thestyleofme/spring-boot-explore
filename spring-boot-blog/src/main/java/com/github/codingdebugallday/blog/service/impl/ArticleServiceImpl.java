package com.github.codingdebugallday.blog.service.impl;

import java.time.Duration;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.codingdebugallday.blog.mapper.ArticleMapper;
import com.github.codingdebugallday.blog.pojo.Article;
import com.github.codingdebugallday.blog.pojo.Page;
import com.github.codingdebugallday.blog.service.ArticleService;
import com.github.codingdebugallday.blog.utils.JsonUtil;
import com.github.codingdebugallday.blog.utils.Md5Util;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/28 10:10
 * @since 1.0.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;
    private final RedisTemplate<String, String> redisTemplate;

    public ArticleServiceImpl(ArticleMapper articleMapper, RedisTemplate<String, String> redisTemplate) {
        this.articleMapper = articleMapper;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public Page<Article> list(Article article, Pageable pageable) {
        // 获取key
        String key = Md5Util.md5DigestAsHex(article.toString() + pageable.toString());
        if (Boolean.TRUE.equals(redisTemplate.hasKey(key))) {
            String value = redisTemplate.opsForValue().get(key);
            // 自定义Page的原因是org.springframework.data.domain.PageImpl没有默认构造方法 这里序列化会报错
            return JsonUtil.toObj(value, new TypeReference<Page<Article>>() {
            });
        }
        // 0 2 ==> 2 2 ==> 4 2
        int pageNumber = pageable.getPageNumber();
        int pageSize = pageable.getPageSize();
        int startNumber = pageNumber == 0 ? pageNumber : pageNumber * pageSize;
        List<Article> articleList = articleMapper.list(article, startNumber, pageSize);
        Long total = articleMapper.count();
        PageImpl<Article> page = new PageImpl<>(articleList, pageable, total);
        Page<Article> result = new Page<>();
        Page<Article> articlePage = result.of(page);
        redisTemplate.opsForValue().set(key, JsonUtil.toJson(articlePage), Duration.ofSeconds(30L));
        return articlePage;
    }
}
