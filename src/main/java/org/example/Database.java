package org.example;

import java.sql.*;

import static java.lang.IO.println;


public class Database {
    //per connettermi uso gli oggetti

    private Connection connection = null;

    public Database() {
        if(!connect()){
            println("no connesso");
            System.exit(-1);  //se non sono connesso allora chiudo tutto
        }
        println("connesso");

    }

    private boolean connect(){
        //ctrl+alt+t ---> faccio il try/catch

        try {
            connection= DriverManager.getConnection("jdbc:sqlite:databse.db");
        } catch (SQLException e) {
            return false; //se trovo l'eccezione ritorno false
        }
        return true;
    }

    public void SelectAll() throws SQLException {
        String query = "Select * from menu";

        Statement statement= connection.prepareStatement(query);

    }
}
