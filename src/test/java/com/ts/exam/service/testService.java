package com.ts.exam.service;

import com.ts.exam.entity.Customer;
import com.ts.exam.entity.Film;
import com.ts.exam.entity.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testService {

    @Autowired
    private IFilmService iFilmService;
    @Autowired
    private ICustomerService iCustomerService;

    @Test
    public void test() {
//        boolean a = false;
////        a = iFilmService.addFilm("asd", "abcdefg", "2");
////        System.out.println(a);
//        Film film = new Film();
//        film.setFilmId((short)1023);
//        film.setTitle("aaaaaaaaa");
//        film.setDescription("bbbbbbbbbbbbbbbbb");
//        film.setLanguageId((byte)3);
//        Page page = new Page();
//        page.setCurrent(5);
//        page.setSize(10);
//        List<Film> list = iFilmService.queryFilmInfoByParams(film,page.getOffset(),page.getSize());
//        for (Film film1 : list) {
//            System.out.println(film1.toString());
//        }
//        a = iFilmService.editOneFilm(film);
//        System.out.println(a);

//        System.out.println(iFilmService.delOneFile((short)1023));

        Customer customer = new Customer();
        customer.setFirstName("MARY");
        customer.setLastName("aaa");
        System.out.println(iCustomerService.checkCustomer(customer));
    }


}
