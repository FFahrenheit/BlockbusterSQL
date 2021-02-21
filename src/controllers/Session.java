/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.Movie;
import models.User;

/**
 *
 * @author ivan_
 */
public class Session {
    
    private TableGenerator generator;
    private ArrayList<User> users;
    private ArrayList<Movie> movies;
    private BlockBuster db;
    private User user;
    private String memberSince;

    public User getUser() {
        return user;
    }
    
    public BlockBuster db()
    {
        return this.db;
    }
    
    public void update()
    {
        movies = db.getMovies();
        users = db.getUsers();
    }
    
    public Session()
    {
        db = new BlockBuster();
        users = db.getUsers();
        generator = new TableGenerator();
        movies = db.getMovies();
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
    
    public ArrayList<Movie> getMovies()
    {
        return this.movies;
    }
    
    public DefaultTableModel getMovieTable()
    {
        return generator.getMovies();
    }
    
    public DefaultTableModel getRentedTable()
    {
        return generator.getRentedMovies(this.user.getUsername());
    }
    
    public DefaultTableModel getRentedLog()
    {
        return generator.getRentedLog(this.user.getUsername());
    }
    
    public Movie getMovie(int id)
    {
        for (int i = 0; i < movies.size(); i++) {
            if(Integer.parseInt(movies.get(i).getId()) == id)
            {
                return movies.get(i);
            }
        }
        return null;
    }
}
