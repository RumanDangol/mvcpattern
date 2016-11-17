/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvc.servlet;

import com.leapfrog.mvc.dao.CustomerDao;
import com.leapfrog.mvc.dao.impl.CustomerDaoImpl;
import com.leapfrog.mvc.entity.Customer;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ruman dangol
 */
@WebServlet(name = "default",urlPatterns = {"/","/home"})
public class DefaultServlet extends HttpServlet{
    private CustomerDao customerDao=new CustomerDaoImpl();
    String path="/WEB-INF/views/";
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
      try{
        request.setAttribute("customers",customerDao.getAll());
        request.getRequestDispatcher(path+"index.jsp").forward(request, response);
       
      }catch(ClassNotFoundException c){
          PrintWriter out = response.getWriter();
          out.println(c.getMessage());
      }catch(SQLException s){
          PrintWriter out = response.getWriter();
          out.println(s.getMessage());
      }
    }
        @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
       
            PrintStream ps=new PrintStream(response.getOutputStream());
            String name= request.getParameter("name");
            ps.println("<h1> Hello "+name+"</h1>");
        
    }
    
}
