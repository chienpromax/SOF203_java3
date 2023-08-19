/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class NewClass1 {

    public static void main(String[] args) {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien";
//            Connection con = DriverManager.getConnection(url,"sa","123");
//            Statement stm = con.createStatement();
//            String sql="select * from student";
//            ResultSet rs = stm.executeQuery(sql);
//            while (rs.next()) {
//                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//            }
//            rs.close();stm.close();con.close();
//        } catch (Exception e) {
//            System.out.println("loi");
//        }

//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien";
//            Connection con = DriverManager.getConnection(url,"sa","123");
//            Statement stm = con.createStatement();
//            String sql="update Student set DiaChi ='danang' where MaSV='SV123'";
//            int rs = stm.executeUpdate(sql);
//            if (rs==0) {
//                System.out.println("loi1");
//            }else
//                System.out.println("ok");
//           
//        } catch (Exception e) {
//            System.out.println(""+e);
//        }
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien";
//            Connection con = DriverManager.getConnection(url,"sa","123");
//            Statement stm = con.createStatement();
//            String sql="delete student where masv='SV123'";
//            int rs = stm.executeUpdate(sql);
//            if (rs==0) {
//                System.out.println("loi1");
//            }else
//                System.out.println("ok");
//           
//        } catch (Exception e) {
//            System.out.println(""+e);
//        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "update Student set DiaChi = ? where MaSV = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, "da nang"); // Set giá trị cho tham số thứ nhất (DiaChi)
            st.setString(2, "123"); // Set giá trị cho tham số thứ hai (MaSV)
            int rs = st.executeUpdate(); // Thực thi câu truy vấn UPDATE
            
            if (rs == 0) {
                System.out.println("loi1");
            } else {
                System.out.println("ok");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
