/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import models.Movie;

/**
 *
 * @author ivan_
 */
public class TableGenerator {
    private BlockBuster db;
    private ArrayList<Movie> movies;
    
    public TableGenerator()
    {
        db = new BlockBuster();
    }
    
    public DefaultTableModel getMovies()
    {
        ArrayList<Movie> mv = db.getMovies();
        
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID");
        cabeceras.addElement("Titulo");
        cabeceras.addElement("Director");
        cabeceras.addElement("Año");
        cabeceras.addElement("Precio");
        cabeceras.addElement("Stock");
        cabeceras.addElement("Genero");
        cabeceras.addElement("Sinopsis");
        
        DefaultTableModel model = new DefaultTableModel(cabeceras, 0)
        {
             @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        mv.forEach(a->
        {
            Vector v = new Vector();
            v.addElement(a.getId());
            v.addElement(a.getTitle());
            v.addElement(a.getDirector());
            v.addElement(a.getYear());
            v.addElement(a.getPrice());
            v.addElement(a.getStock());
            v.addElement(a.getGenre());
            v.addElement(a.getSinopsis());
            model.addRow(v);
        });
        
        this.movies = mv;
        return model;
    }
}
