package com.ts.exam.dao;

import com.ts.exam.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/4.
 */
@Repository
public interface ICustomerDao {

    /**
     * 根据firstName,lastName查询用户
     *
     * @param customer 实体customer
     * @return List<Customer>
     */
    List<Customer> checkCustomer(Customer customer);

}
