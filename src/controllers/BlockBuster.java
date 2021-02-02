/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Movie;

/**
 *
 * @author ivan_
 */
public class BlockBuster {
    private Connection connection;
    
    public BlockBuster()
    {
        Database db = new Database();
        this.connection = db.getDB();
    }
    
    public boolean addMovie(Movie movie)
    {
        String query = "INSERT INTO peliculas(titulo,director,fecha,"
                + "precio,stock,sinopsis,genero) VALUES"
                + "('"+movie.getTitle()+"','"+movie.getDirector()+"',"
                + "'"+movie.getYear()+"',"+movie.getPrice()+","
                + ""+movie.getStock()+",'"+movie.getSinopsis()+"',"
                + "'"+movie.getGenre()+"')";
        
        return executeQuery(query);
    }
    
    public ArrayList<Movie> getMovies()
    {
        ArrayList<Movie> movies = new ArrayList<>();
        String query = "SELECT * FROM peliculas";
        try
        {
            PreparedStatement select = connection.prepareStatement(query);
            ResultSet result = select.executeQuery();
            while(result.next())
            {
                Movie movie = new Movie();
                
                movie.setId(result.getString("id"));
                movie.setTitle(result.getString("titulo"));
                movie.setDirector(result.getString("director"));
                movie.setGenre(result.getString("genero"));
                movie.setPrice(result.getString("precio"));
                movie.setYear(result.getString("fecha"));
                movie.setStock(result.getString("stock"));
                movie.setSinopsis(result.getString("sinopsis"));
                
                movies.add(movie);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("No se pudieron cargar las peliculas");
        }
        return movies;
    }
    
    private boolean executeQuery(String query)
    {
        System.out.println(query);
        try 
        {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.execute();
            return true;
        }
        catch(SQLException  ex)
        {
            System.out.println("Fallo al ejecutar query");
            return false;
        }
    }

}
