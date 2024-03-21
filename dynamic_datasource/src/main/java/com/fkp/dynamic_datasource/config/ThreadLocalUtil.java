package com.fkp.dynamic_datasource.config;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/11/9 19:40
 */
public class ThreadLocalUtil {
    private static final ThreadLocal<Map<String, Object>> THREAD_LOCAL = new ThreadLocal<>();

    public static void set(String key, Object value) {
        Map<String, Object> map = getLocalMap();
        map.put(Optional.ofNullable(key).orElse(StringUtils.EMPTY), value);
    }

    public static Object get(String key) {
        Map<String, Object> map = getLocalMap();
        return map.get(key);
    }

    public static <T> T get(String key, Class<T> clazz) {
        Map<String, Object> map = getLocalMap();
        Object value = map.get(key);
        return value != null ? clazz.cast(value) : null;
    }

    public static void remove() {
        THREAD_LOCAL.remove();
    }

    private static Map<String, Object> getLocalMap() {
        Map<String, Object> map = THREAD_LOCAL.get();
        if (map == null) {
            map = new HashMap<>();
            THREAD_LOCAL.set(map);
        }
        return map;
    }
}
