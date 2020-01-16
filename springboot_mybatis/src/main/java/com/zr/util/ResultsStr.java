package com.zr.util;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.zr.pojo.User;

import java.lang.reflect.Field;


public class ResultsStr {

    public static void main(String[] args) {
        String resultsStr = getResultsStr(User.class);
        System.out.println(resultsStr);

    }

    public static String getResultsStr(Class origin) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@Results({\n");
        for (Field field : origin.getDeclaredFields()) {
            String property = field.getName();
            //映射关系：对象属性(驼峰)->数据库字段(下划线)
            String column = new PropertyNamingStrategy.SnakeCaseStrategy().translate(field.getName()).toUpperCase();
            stringBuilder.append(String.format("@Result(property = \"%s\", column = \"%s\"),\n", property, column));
        }
        stringBuilder.append("})");
        return stringBuilder.toString();
    }
}
