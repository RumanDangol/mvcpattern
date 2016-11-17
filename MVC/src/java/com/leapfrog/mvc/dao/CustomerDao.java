/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvc.dao;

import com.leapfrog.mvc.entity.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ruman dangol
 */
public interface CustomerDao {
    List<Customer> getAll() throws SQLException,ClassNotFoundException;
    
}
