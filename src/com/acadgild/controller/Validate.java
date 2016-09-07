/*
 * Java Class that validates user credential against mySQL Database entries 
 * 
 */

package com.acadgild.controller;

import java.sql.*;

//@WebServlet("/Validate")
public class Validate
 {
     public static boolean checkUser(String email,String pass) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql:/ /localhost:3306/springdbc","root","Nikomysql");
         PreparedStatement ps =con.prepareStatement
                             ("select * from register where email=? and pass=?");
         ps.setString(1, email);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}
