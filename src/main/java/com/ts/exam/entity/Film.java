package com.ts.exam.entity;

import org.springframework.stereotype.Component;

import java.beans.Transient;

/**
 * 电影实体类
 * Created by ASpiralMoon on 2016/12/29.
 */
public class Film {

    private Short filmId;
    private String title; // 电影标题
    private String description; // 电影描述
    private Byte languageId; // 电影语言
    private Language language;

    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", languageId=" + languageId +
                ", language=" + language +
                '}';
    }
}
