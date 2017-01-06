package com.ts.exam.dao;

import com.ts.exam.entity.Film;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDao {

    @Autowired
    private IFilmDao iFilmDao;

    @Autowired
    public void test() {
        Film film = new Film();
        film.setTitle("111");
        film.setDescription("111");
        film.setLanguageId((byte) 6);
    }

}
