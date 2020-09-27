package com.github.codingdebugallday.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * <p>
 * 这里实现Serializable的原因：
 * spring boot redis默认序列化方式是jdk序列化（JdkSerializationRedisSerializer）
 * 故必须实现Serializable接口
 * </p>
 *
 * @author isaac 2020/09/26 22:14
 * @since 1.0.0
 */
@Entity
@Table(name = "t_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1076731808234605292L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String author;
    @Column(name = "article_id")
    private Long articleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", articleId=" + articleId +
                '}';
    }
}
