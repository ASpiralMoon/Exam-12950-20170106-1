package com.ts.exam.service.impl;

import com.ts.exam.dao.ICustomerDao;
import com.ts.exam.entity.Customer;
import com.ts.exam.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/4.
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDao iCustomerDao;

    @Override
    public boolean checkCustomer(Customer customer) {
        List<Customer> list = iCustomerDao.checkCustomer(customer);
        if (list.size() != 0) {
            return true;
        }
        return false;
    }
}
