/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvc.dao.impl;

import com.leapfrog.mvc.dao.CustomerDao;
import com.leapfrog.mvc.dbconnection.DbConnection;
import com.leapfrog.mvc.entity.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruman dangol
 */
public class CustomerDaoImpl implements CustomerDao {
       DbConnection db=new DbConnection(); 

    @Override
    public List<Customer> getAll() throws ClassNotFoundException, SQLException {
       List<Customer> customerList=new ArrayList<>();
       db.open();
       String sql="SELECT * FROM friendlist";
       db.initStatement(sql);
       ResultSet rs=db.executeQuery();
       while(rs.next()){
           Customer c=new Customer();
           c.setId(rs.getInt("id"));
           c.setFirstName(rs.getString("firstNane"));
           c.setLastName(rs.getString("lastName"));
           customerList.add(c);
           
       }
       db.close();
       return customerList;
       
    }
    
}
