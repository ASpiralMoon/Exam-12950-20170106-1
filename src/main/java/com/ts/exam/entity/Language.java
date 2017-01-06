package com.ts.exam.entity;

import org.springframework.stereotype.Component;

/**
 * 语言实体类
 * Created by ASpiralMoon on 2017/1/4.
 */
public class Language {

    private Byte languageId;
    private String name;

    public Byte getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId +
                ", name='" + name + '\'' +
                '}';
    }
}
