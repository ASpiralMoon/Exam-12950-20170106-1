package com.ts.exam.controller;

import com.ts.exam.entity.Film;
import com.ts.exam.entity.Language;
import com.ts.exam.entity.Page;
import com.ts.exam.service.IFilmService;
import com.ts.exam.service.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASpiralMoon on 2017/1/5.
 */
@Controller
@RequestMapping("/listFilmController")
public class ListFilmController {

    @Autowired
    private IFilmService iFilmService;
    @Autowired
    private ILanguageService iLanguageService;

    Map<String, Object> map;

    @ResponseBody
    @RequestMapping("/query")
    public Map<String, Object> query(
            @RequestParam(value = "filmId", required = false) Short filmId,
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "description", required = false) String description,
            @RequestParam(value = "current", required = false, defaultValue = "1") Integer current,
            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size
    ) {
        Page page = new Page();
        page.setCurrent(current);
        page.setSize(size);
        page.setTotalCount(iFilmService.queryTotalCount());
        map = new HashMap<>();
        List<Film> list1 = iFilmService.queryFilmInfoByParams(filmId, title, description, page);
        List<Language> list2 = iLanguageService.queryAllLanguage();
        map.put("films", list1);
        map.put("languages", list2);
        map.put("totalCount", page.getTotalCount());
        map.put("current", page.getCurrent());
        map.put("size", page.getSize());

        Film film = new Film();
        film.setTitle(title);
        film.setDescription(description);
        Integer total = iFilmService.queryTotalByFilm(film);
        map.put("total", total);
        return map;
    }

    @ResponseBody
    @RequestMapping("/add")
    public Map<String, Object> add(@RequestBody Film film) {
        boolean msg = iFilmService.addFilm(film);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

    @ResponseBody
    @RequestMapping("/delete")
    public Map<String, Object> delete(@RequestParam("filmId") Short filmId) {
        boolean msg = iFilmService.delOneFile(filmId);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

    @ResponseBody
    @RequestMapping("/edit")
    public Map<String, Object> edit(@RequestBody Film film) {
        boolean msg = iFilmService.editOneFilm(film);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }
}
