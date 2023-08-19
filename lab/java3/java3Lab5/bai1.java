/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3Lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class bai1 {
    public static void main(String[] args) {
                 try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien";
            Connection con = DriverManager.getConnection(url,"sa","123");
            Statement stm = con.createStatement();
            String sql="select * from student";
            ResultSet rs = stm.executeQuery(sql);
            //String sql="delete from NHANVIEN where MANV = 01";
            //String sql="update NHANVIEN set DCHI = 'da nang' where MANV = 01";
            //int rs = stm.executeUpdate(sql);
//            if (rs==0) {
//                System.out.println("that bai");
//            }else {
//                System.out.println("thanh cong");
//            }
            while (rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
            }
            rs.close();stm.close();con.close();
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
}
