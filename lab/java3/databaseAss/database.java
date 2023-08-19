/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseAss;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class database {   
    public static final String connectionUrl ="jdbc:sqlserver://localhost:1433;"+ 
            "databaseName=FPL_DaoTao;user=sa; password=123";
    
    public static Connection getDBConnect(){
        try {
            Connection con =null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = (Connection) DriverManager.getConnection(connectionUrl);
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("loi"+ex.toString());
        } catch (SQLException ex) {
            System.out.println("loi"+ex.toString());
        }
        return null;
    }
        

}
