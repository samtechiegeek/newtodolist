/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.dao;

import com.todo.entities.NewList;
import com.todo.entities.User;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Windows
 */
public class ListDao {
  


    private final Connection con;

    public ListDao(Connection con) {
        this.con = con;
    }
    public boolean DataList(NewList list)
    {
        boolean f=false;
        try
        {
            String query="insert into listdata (listdata) values(?)";
            PreparedStatement ps=this.con.prepareStatement(query);
            ps.setString(1,list.getListdata());
           
            
            ps.executeUpdate();
            f=true;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
    
    public ArrayList<NewList> AllList()
    {
        ArrayList<NewList>arrlist=new ArrayList<>();
        boolean f=false;
        try
        {
            String query="select * from listdata";
            PreparedStatement ps=this.con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               int listid=rs.getInt("listid");
               String listdata=rs.getString("listdata");
               NewList l=new NewList(listid,listdata);
                arrlist.add(l);
           }
            
           
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return arrlist;
    }
    public boolean AddFrontList(int id,NewList list)
    {
        boolean f=false;
        try
        {
            String query="insert into listdata (listid,listdata) values(?,?)";
            PreparedStatement ps=this.con.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2,list.getListdata());
           
            
            ps.executeUpdate();
            f=true;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
     
}

