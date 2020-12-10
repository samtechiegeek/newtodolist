/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.helper;

import java.sql.*;
public class ConnectionProvider {
    private static Connection con;
    @SuppressWarnings("CallToPrintStackTrace")
    public static Connection getConnection()
    {
        try
        {
            if(con==null){
            //driver Load
            Class.forName("com.mysql.jdbc.Driver");
            //Connection Create
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/todo","root","");
          
            
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return con;
    }
    
}
