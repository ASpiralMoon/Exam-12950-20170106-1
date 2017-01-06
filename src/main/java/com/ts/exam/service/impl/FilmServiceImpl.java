package com.ts.exam.service.impl;

import com.ts.exam.dao.IFilmDao;
import com.ts.exam.entity.Film;
import com.ts.exam.entity.Page;
import com.ts.exam.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
@Service
public class FilmServiceImpl implements IFilmService {

    @Autowired
    private IFilmDao iFilmDao;

    @Override
    public boolean addFilm(Film film) {
        int i = iFilmDao.addOneFilm(film);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public List<Film> queryFilmInfoByParams(Short filmId, String title, String description, Page page) {
        List<Film> list = iFilmDao.queryFilmInfoByParams(filmId,title, description, page.getOffset(), page.getSize());
        return list;
    }

    @Override
    public boolean editOneFilm(Film film) {
        int i = iFilmDao.editOneFilm(film);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delOneFile(Short filmId) {
        try {
            int i = iFilmDao.delOneFilm(filmId);
            if (i == 1) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    @Override
    public int queryTotalCount() {
        return iFilmDao.queryTotalCount();
    }

    @Override
    public int queryTotalByFilm(Film film) {
        return iFilmDao.queryTotalByFilm(film);
    }
}
