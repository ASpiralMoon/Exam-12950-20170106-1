package com.ts.exam.service;

import com.ts.exam.entity.Film;
import com.ts.exam.entity.Page;

import java.util.List;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
public interface IFilmService {

    boolean addFilm(Film film);

    List<Film> queryFilmInfoByParams(Short filmId, String title, String description, Page page);

    boolean editOneFilm(Film film);

    boolean delOneFile(Short filmId);

    int queryTotalCount();

    int queryTotalByFilm(Film film);

}
