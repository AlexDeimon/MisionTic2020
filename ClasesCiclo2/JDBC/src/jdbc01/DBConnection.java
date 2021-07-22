/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc01;
import java.sql.*;
/**
 *
 * @author DIEGO
 */
public class DBConnection {
    final static String USER="root";
    final static String PASS="Dasf180999";
    final static String URL = "jdbc:mysql://localhost:3306/reto?serverTimezone=UTC";

    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
