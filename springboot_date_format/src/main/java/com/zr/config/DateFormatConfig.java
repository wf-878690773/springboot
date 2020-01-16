package com.zr.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 全局日期格式化
 */
@JsonComponent
public class DateFormatConfig {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 日期格式化
     */
    public static class DateJsonSerializer extends JsonSerializer<Date>{

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

            gen.writeString(simpleDateFormat.format(value));
        }
    }

    /**
     * 解析日期字符串
     */
    public static class DateJsonDeserializer extends JsonDeserializer<Date>{

        @Override
        public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {

            try {
                return simpleDateFormat.parse(p.getText());
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
