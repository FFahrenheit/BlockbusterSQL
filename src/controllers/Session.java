/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.User;

/**
 *
 * @author ivan_
 */
public class Session {
    
    private ArrayList<User> users;
    private BlockBuster db;
    private User user;

    public User getUser() {
        return user;
    }
    
    public Session()
    {
        db = new BlockBuster();
        users = db.getUsers();
    }
    
    public boolean login(String username, String password)
    {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUsername().equals(username) && users.get(i).getPassword().equals(password))
            {
                this.user = users.get(i);
                return true;
            }
        }
        return false;
    }
}
