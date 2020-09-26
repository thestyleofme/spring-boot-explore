package com.github.codingdebugallday.config;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/27 1:23
 * @since 1.0.0
 */
@Configuration
public class MyLocaleResolver implements LocaleResolver {

    /**
     * 自定义区域解析方式
     *
     * @param httpServletRequest HttpServletRequest
     * @return Locale
     */
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        // 获取页面手动传递的语言参数值l ：zh_CN en_US 或者没传
        String l = httpServletRequest.getParameter("l");
        Locale locale;
        if (!StringUtils.isEmpty(l)) {
            String[] s = l.split("_");
            locale = new Locale(s[0], s[1]);
        } else {
            // 未传语言参数l时根据header中Accept-Language进行判断   如值：zh-CN,zh;q=0.9
            String header = httpServletRequest.getHeader("Accept-Language");
            String[] split = header.split(",");
            String[] s = split[0].split("-");
            locale = new Locale(s[0], s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
