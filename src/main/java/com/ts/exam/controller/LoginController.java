package com.ts.exam.controller;

import com.ts.exam.entity.Customer;
import com.ts.exam.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ASpiralMoon on 2017/1/4.
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    private ICustomerService iCustomerService;

    @ResponseBody
    @RequestMapping("/login")
    public Map<String, Object> login(@RequestBody Customer customer) {
        boolean msg = iCustomerService.checkCustomer(customer);
        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

}
