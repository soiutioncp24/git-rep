package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    void setTable(){}
    public void doXML(){}
    public void changeXML(String fileName){}
    public int parseXML(String fileName){return 0;}
    public static void main(String[] args) {
        Connection connect = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connect= DriverManager.getConnection("jdbc:sqlite:test_task.db");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
            connect.close();}
            catch (Exception e){e.printStackTrace();}
        }


        // write your code here
    }
}
