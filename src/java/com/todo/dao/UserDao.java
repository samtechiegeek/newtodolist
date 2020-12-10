/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.dao;


import com.todo.entities.User;
import java.sql.*;
public class UserDao {
    private final Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
    //method to insert usert to data
    public boolean saveUser(User user)
    {
        boolean f=false;
        try
        {
            String query="insert into user (uname,pass,email) values(?,?,?)";
            PreparedStatement ps=this.con.prepareStatement(query);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getEmail());
            
            ps.executeUpdate();
            f=true;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
    //get user by user emmail and password
}