/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;


import java.sql.*;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien";
            Connection con = DriverManager.getConnection(url,"sa","123");
            Statement stm = con.createStatement();
            //String sql="select * from student";
            //ResultSet rs = stm.executeQuery(sql);
            //String sql="delete from NHANVIEN where MANV = 01";
            String sql="update student set DiaCHI = 'da nang' where MASV = SV123";
            int rs = stm.executeUpdate(sql);
            if (rs==0) {
                System.out.println("that bai");
            }else {
                System.out.println("thanh cong");
            }
//            while (rs.next()) {
//                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//            }
            //rs.close();stm.close();con.close();
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
}
