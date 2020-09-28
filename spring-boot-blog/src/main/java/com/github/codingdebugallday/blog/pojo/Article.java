package com.github.codingdebugallday.blog.pojo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/28 9:51
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Article {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime modified;
    private String categories;
    private String tags;
    private Integer allowComment;
    private String thumbnail;
}
