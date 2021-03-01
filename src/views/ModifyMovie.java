/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.BlockBuster;
import controllers.Session;
import controllers.TableGenerator;
import javax.swing.JOptionPane;
import models.Movie;

/**
 *
 * @author ivan_
 */
public class ModifyMovie extends javax.swing.JFrame {
    
    BlockBuster db;
    TableGenerator generator;
    Session session;
    Integer selected;
    /**
     * Creates new form ModifyMovie
     */
    public ModifyMovie() {
        initComponents();
        db = new BlockBuster();
        generator = new TableGenerator();
        this.movieTable.setModel(generator.getMovies());
        this.setTitle("Agregar peliculas");
    }
    
    public ModifyMovie(Session session) {
        initComponents();
        db = new BlockBuster();
        generator = new TableGenerator();
        this.movieTable.setModel(generator.getMovies());
        this.setTitle("Agregar peliculas");
        this.session = session;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        titleF = new javax.swing.JTextField();
        priceF = new javax.swing.JTextField();
        yearF = new javax.swing.JTextField();
        stockF = new javax.swing.JTextField();
        genreF = new javax.swing.JTextField();
        directorF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsisF = new javax.swing.JTextArea();
        editMovie = new javax.swing.JButton();
        exitB = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        movieTable = new javax.swing.JTable();
        deleteMovie = new javax.swing.JButton();
        cleanForm = new javax.swing.JButton();
        addMovie = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTree1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MODIFICAR Y ELIMINAR PELICULAS");

        jLabel2.setText("NOMBRE");

        jLabel4.setText("AÑO");

        jLabel5.setText("PRECIO");

        jLabel6.setText("STOCK");

        jLabel7.setText("SINOPSIS");

        jLabel8.setText("GENERO");

        titleF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFActionPerformed(evt);
            }
        });

        yearF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFActionPerformed(evt);
            }
        });

        directorF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorFActionPerformed(evt);
            }
        });

        jLabel3.setText("DIRECTOR");

        sinopsisF.setColumns(20);
        sinopsisF.setRows(5);
        jScrollPane1.setViewportView(sinopsisF);

        editMovie.setText("EDITAR");
        editMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMovieActionPerformed(evt);
            }
        });

        exitB.setText("REGRESAR");
        exitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBActionPerformed(evt);
            }
        });

        movieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        movieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(movieTable);

        scrollPane1.add(jScrollPane4);

        deleteMovie.setText("ELIMINAR");
        deleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMovieActionPerformed(evt);
            }
        });

        cleanForm.setText("LIMPIAR");
        cleanForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanFormActionPerformed(evt);
            }
        });

        addMovie.setText("AGREGAR");
        addMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleF)
                            .addComponent(yearF, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(directorF))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stockF)
                    .addComponent(genreF)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(238, 238, 238))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cleanForm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(editMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(titleF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(directorF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(priceF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(stockF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genreF)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editMovie)
                    .addComponent(exitB)
                    .addComponent(deleteMovie)
                    .addComponent(cleanForm)
                    .addComponent(addMovie))
                .addGap(26, 26, 26)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFActionPerformed

    private void directorFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorFActionPerformed

    private void yearFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFActionPerformed

    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBActionPerformed
        this.dispose();
        new AdminIndex(session).setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_exitBActionPerformed

    private void editMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMovieActionPerformed
        // TODO add your handling code here:
        if(selected != null)
        {
        Movie movie = new Movie(
            selected.toString(),
            titleF.getText().toString(),
            directorF.getText().toString(),
            sinopsisF.getText().toString(),
            genreF.getText().toString(),
            priceF.getText().toString(),
            stockF.getText().toString(),
            yearF.getText().toString());            
        int input = JOptionPane.showConfirmDialog(null, "Desea editar "+movie.getTitle()+"?");
            
            if(input == 0)
            {
                if(session.db().editMovie(movie))
                {
                    titleF.setText("");
                    directorF.setText("");
                    sinopsisF.setText("");
                    genreF.setText("");
                    priceF.setText("");
                    stockF.setText("");
                    yearF.setText("");
                    movieTable.setModel(generator.getMovies());
                    selected = null;
                    JOptionPane.showMessageDialog(this, "Se ha editado la pelicula","Editado",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Verifique los campos","No se puede editar",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Seleccione una pelicula","No se puede editar",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editMovieActionPerformed

    private void movieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieTableMouseClicked
        // TODO add your handling code here:
        int seleccion = movieTable.rowAtPoint(evt.getPoint());
        titleF.setText(movieTable.getValueAt(seleccion, 1).toString());
        directorF.setText(movieTable.getValueAt(seleccion, 2).toString());
        yearF.setText(movieTable.getValueAt(seleccion, 3).toString());
        priceF.setText(movieTable.getValueAt(seleccion, 4).toString());
        stockF.setText(movieTable.getValueAt(seleccion, 5).toString());
        genreF.setText(movieTable.getValueAt(seleccion, 6).toString());
        sinopsisF.setText(movieTable.getValueAt(seleccion, 7).toString());

        selected = Integer.parseInt(movieTable.getValueAt(seleccion, 0).toString());
    }//GEN-LAST:event_movieTableMouseClicked

    private void deleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMovieActionPerformed
        // TODO add your handling code here:
        if(selected != null)
        {
            Movie movie = session.getMovie(selected);
            int input = JOptionPane.showConfirmDialog(null, "Desea eliminar "+movie.getTitle()+"?");
            if(input == 0)
            {
                if(session.db().deleteMovie(movie))
                {
                    clean();                    
                    JOptionPane.showMessageDialog(this, "Se ha eliminado la pelicula","Eliminado",JOptionPane.INFORMATION_MESSAGE);

                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Verifique los campos","No se pudo eliminar",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Seleccione una pelicula","No se puede eliminar",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteMovieActionPerformed

    
    private void clean()
    {
        this.selected = null;
        titleF.setText("");
        directorF.setText("");
        sinopsisF.setText("");
        genreF.setText("");
        priceF.setText("");
        stockF.setText("");
        yearF.setText("");
        movieTable.setModel(generator.getMovies());
        this.session.update();
    }
    private void cleanFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanFormActionPerformed
        clean();
    }//GEN-LAST:event_cleanFormActionPerformed

    private void addMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieActionPerformed
        // TODO add your handling code here:
        Movie movie = new Movie(
        "",
        titleF.getText().toString(),
        directorF.getText().toString(),
        sinopsisF.getText().toString(),
        genreF.getText().toString(),
        priceF.getText().toString(),
        stockF.getText().toString(),
        yearF.getText().toString());
        
        if(db.addMovie(movie))
        {
            JOptionPane.showMessageDialog(this, "Pelicula agregada");
            clean();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No se pudo agregar, verifique los campos","Error" ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addMovieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifyMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovie;
    private javax.swing.JButton cleanForm;
    private javax.swing.JButton deleteMovie;
    private javax.swing.JTextField directorF;
    private javax.swing.JButton editMovie;
    private javax.swing.JButton exitB;
    private javax.swing.JTextField genreF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable movieTable;
    private javax.swing.JTextField priceF;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextArea sinopsisF;
    private javax.swing.JTextField stockF;
    private javax.swing.JTextField titleF;
    private javax.swing.JTextField yearF;
    // End of variables declaration//GEN-END:variables
}
