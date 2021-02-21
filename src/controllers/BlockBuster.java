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
import models.Rented;
import models.RentedMovie;
import models.User;

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
    
    public ArrayList<Rented> getRentedMovies(String user)
    {
        ArrayList<Rented> movies = new ArrayList<>();
        String query = "SELECT peliculas.*,rentadas.fecha AS fecha2, rentadas.id AS id2 FROM peliculas,rentadas WHERE "
                + "rentadas.usuario = '"+user+"' AND rentadas.pelicula = peliculas.id AND "
                + "rentadas.entregada IS NULL";
        System.out.println(query);
        try
        {
            PreparedStatement select = connection.prepareStatement(query);
            ResultSet result = select.executeQuery();
            while(result.next())
            {
                Rented movie = new Rented();
                
                movie.setId(result.getString("id2"));
                movie.setTitle(result.getString("titulo"));
                movie.setDirector(result.getString("director"));
                movie.setYear(result.getString("fecha"));
                movie.setDate(result.getString("fecha2"));
                
                movies.add(movie);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("No se pudieron cargar las peliculas" + ex.getMessage());
        }
        return movies;
    }
    
        public ArrayList<RentedMovie> getRentedLog(String user)
    {
        ArrayList<RentedMovie> movies = new ArrayList<>();
        String query = "SELECT peliculas.*,rentadas.fecha AS fecha2, rentadas.id AS id2, "
                + "rentadas.entregada AS fecha3 FROM peliculas,rentadas WHERE "
                + "rentadas.usuario = '"+user+"' AND rentadas.pelicula = peliculas.id AND "
                + "rentadas.entregada IS NOT NULL";
        try
        {
            PreparedStatement select = connection.prepareStatement(query);
            ResultSet result = select.executeQuery();
            while(result.next())
            {
                RentedMovie movie = new RentedMovie();
                
                movie.setId(result.getString("id2"));
                movie.setTitle(result.getString("titulo"));
                movie.setDirector(result.getString("director"));
                movie.setYear(result.getString("fecha"));
                movie.setDate(result.getString("fecha2"));
                movie.setReturned(result.getString("fecha3"));
                movies.add(movie);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("No se pudieron cargar las peliculas" + ex.getMessage());
        }
        return movies;
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
            System.out.println("No se pudieron cargar las peliculas" + ex.getMessage());
        }
        return movies;
    }
    
    public boolean addUser(User user){
        String query = "INSERT INTO usuarios(username,password,nombre,apellidos,correo) VALUES "
                + " ('"+user.getUsername()+"','"+user.getPassword()+""
                + "','"+user.getFirstName()+"','"+user.getLastName()+"','"
                + user.getEmail() + "')";
        return executeQuery(query);
    }
    
    public ArrayList<User> getUsers()
    {
        ArrayList<User> users = new ArrayList<>();
        String query = "SELECT * FROM usuarios";
        try
        {
            PreparedStatement select = connection.prepareStatement(query);
            ResultSet result = select.executeQuery();
            while(result.next())
            {
                User user = new User();
                
                user.setUsername(result.getString("username"));
                user.setPassword(result.getString("password"));
                user.setFirstName(result.getString("nombre"));
                user.setType(result.getString("tipo"));
                user.setLastName(result.getString("apellidos"));
                user.setEmail(result.getString("correo"));
                
                users.add(user);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("No se pudieron cargar los usuarios: "+ex.getMessage());
        }
        return users;
    }
        
    public boolean rentMovie(String movie, String user)
    {
        String sql = "INSERT INTO rentadas (pelicula,usuario) VALUES "
                + "("+movie+",'"+user+"')";
        return executeQuery(sql);
    }
    
    public boolean returnMovie(Integer selected) {
        String sql = "UPDATE rentadas SET entregada = NOW() WHERE id = " + selected;
        return executeQuery(sql);
    }
    
    public String isMember(String user)
    {
        String query = "SELECT fecha FROM socios WHERE usuario = '"+user+"'";
        try
        {
            PreparedStatement select = connection.prepareStatement(query);
            ResultSet result = select.executeQuery();
            while(result.next())
            {
                return result.getString("fecha");
            }
        }
        catch(SQLException ex)
        {
            System.out.println("No se pudieron cargar los usuarios: "+ex.getMessage());
        }
        return null;
    }
    
    public boolean makeMember(String username) {
        String sql = "INSERT INTO socios(usuario) VALUES ('"+username+"')";
        return executeQuery(sql);
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
