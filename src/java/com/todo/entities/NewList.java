/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.entities;

/**
 *
 * @author Windows
 */
public class NewList {
    
    private int listid;
    private String Listdata;

    public NewList() {
    }

    public NewList(String Listdata) {
        this.Listdata = Listdata;
    }

    public NewList(int listid, String Listdata) {
        this.listid = listid;
        this.Listdata = Listdata;
    }
    

    public int getListid() {
        return listid;
    }

    public void setListid(int listid) {
        this.listid = listid;
    }

    public String getListdata() {
        return Listdata;
    }

    public void setListdata(String Listdata) {
        this.Listdata = Listdata;
    }
    
    
    
}
