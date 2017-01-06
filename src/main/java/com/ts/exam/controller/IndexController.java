package com.ts.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ASpiralMoon on 2017/1/4.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/toListFilm")
    public String toListFilm() {
        return "listFilm";
    }

    @RequestMapping("/toDetailed")
    public String toDetailed() {
        return "detailed";
    }
}
