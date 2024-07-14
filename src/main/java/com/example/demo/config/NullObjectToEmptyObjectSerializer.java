package com.example.demo.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.util.Map;

/**
 * 使用方法： @JsonSerialize(nullsUsing = NullObjectToEmptyObjectSerializer.class)
 * 效果： null对象会被转换为空对象 {}
 * 注意：
 * 1. 请务必使用nullsUsing 表示仅当值为null时， 才会进入本类 serialize 方法
 * 2. 请勿用在数组类对象上， 因为数组类的空对象应以 [] 表示，而非 {}
 * @author 丁公子
 * @date 2021/2/20
 */
@JsonComponent
public class NullObjectToEmptyObjectSerializer extends JsonSerializer<Map<Object, Object>> {

    @Override
    public void serialize(Map<Object, Object> map, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object key = entry.getKey() == null ? "null" : entry.getKey();
            gen.writeObjectField(key.toString(), entry.getValue());
        }
        gen.writeEndObject();
    }
}

