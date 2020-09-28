package com.github.codingdebugallday.blog.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/28 17:17
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Page<T> {

    private List<T> content;
    private long total;
    private int pageSize;
    private int pageNumber;
    private int totalPages;

    public Page<T> of(org.springframework.data.domain.Page<T> page){
        Page<T> result = new Page<>();
        result.setContent(page.getContent());
        result.setTotal(page.getTotalElements());
        result.setPageNumber(page.getPageable().getPageNumber());
        result.setPageSize(page.getPageable().getPageSize());
        result.setTotalPages(page.getTotalPages());
        return result;
    }

}
