package com.github.khda91.cucumber.demo.transformer;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import java.lang.reflect.Type;
import java.util.Map;

public class CucumberDataTypeConverter {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @DefaultDataTableEntryTransformer
    public Object defaultMapTransformer(Map<String, String> fromValue, Type toTypeValue) {
        JavaType type = objectMapper.constructType(toTypeValue);
        return objectMapper.convertValue(fromValue, type);
    }
}
