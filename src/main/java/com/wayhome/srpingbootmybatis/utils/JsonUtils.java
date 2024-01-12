package com.wayhome.srpingbootmybatis.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public final class JsonUtils {

    public static String toJson(Object object) {
        return toJson(object, false);
    }

    public static String toJson(Object object, boolean nonNull) {
        if (object == null) {
            return "";
        }
        ObjectMapper objectMapper = new ObjectMapper();

        if (nonNull) {
            objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        } else {
            // 字段值为null时不序列化
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        }

        // 忽略未知字段
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("object转json出现异常", e);
        }
        return "";
    }

    public static <T> T parseJson(String json, Class<T> clz) throws IOException {
        return parseJson(json, clz, false);
    }

    public static <T> T parseJson(String json, Class<T> clz, boolean nonNull) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        if (nonNull) {
            objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        } else {
            // 字段值为null时不序列化
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        }
        // 忽略未知字段
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return objectMapper.readValue(json, clz);

    }

    /**
     * string转jsonNode
     *
     * @param jsonString json字符串
     * @return JsonNode
     */
    public static JsonNode getJsonNode(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = objectMapper.readTree(jsonString);
        } catch (IOException e) {
            log.error("", e);
        }
        return jsonNode;
    }


}
