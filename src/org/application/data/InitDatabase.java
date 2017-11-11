/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.application.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhayjadhav
 */
public class InitDatabase {
    public static InitDatabase instance = null;
    private Connection con = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    PreparedStatement ps = null;
    
    public static InitDatabase getInstance() throws SQLException, ClassNotFoundException {

        if (instance == null) {
            instance = new InitDatabase();
        }
        return instance;
    }

    public InitDatabase() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/testing","root","");
    }
    
    public Connection getConnection() {
        try {
            if (con.isClosed()) {
                statement = con.createStatement();
                return con;
            }
        } catch (SQLException ex) {
            Logger.getLogger(InitDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public void closeConnection() {
        try {
            if (!con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(InitDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
