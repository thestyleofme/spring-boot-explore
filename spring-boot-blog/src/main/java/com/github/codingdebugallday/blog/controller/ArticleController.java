package com.github.codingdebugallday.blog.controller;

import com.github.codingdebugallday.blog.pojo.Article;
import com.github.codingdebugallday.blog.pojo.Page;
import com.github.codingdebugallday.blog.service.ArticleService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/28 10:08
 * @since 1.0.0
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public String list(Model model, Article article,
                       @RequestParam(value = "page", defaultValue = "0") Integer page,
                       @RequestParam(value = "size", defaultValue = "2") Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Article> articlePage = articleService.list(article, pageRequest);
        model.addAttribute("articleList", articlePage.getContent());
        model.addAttribute("pageSize", articlePage.getPageSize());
        model.addAttribute("pageNumber", articlePage.getPageNumber());
        model.addAttribute("totalPages", articlePage.getTotalPages() - 1);
        return "client/index";
    }
}
