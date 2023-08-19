/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3Lab5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.util.Scanner;

public class DemoPrepareCall2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FPL_DaoTao";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "{call empName (?, ?)}";
            CallableStatement stmt = con.prepareCall(sql);
            String StID = "Sv01";
            stmt.setString(1, StID);
            stmt.registerOutParameter(2, java.sql.Types.INTEGER);
            System.out.println("Executing stored procedure...");
            stmt.execute();
            String ten = stmt.getString(2);
            System.out.println("ten" + StID + " la: " + ten);
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

