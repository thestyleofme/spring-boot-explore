package com.github.codingdebugallday.blog.utils;

import java.nio.charset.StandardCharsets;

import org.springframework.util.DigestUtils;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/28 17:00
 * @since 1.0.0
 */
public class Md5Util {

    private Md5Util() {
        throw new IllegalStateException();
    }

    public static String md5DigestAsHex(String str) {
        return DigestUtils.md5DigestAsHex(str.getBytes(StandardCharsets.UTF_8));
    }
}
