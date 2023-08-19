/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java3lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai1Client {
    public static void main(String[] args) {
        try {
            System.out.println("client is conneting");
            Socket socket = new Socket("localhost", 8888);
            System.out.println("client is connect");
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream InputStream = new DataInputStream(socket.getInputStream());
            while (true) {
                System.out.println("hay nhap vao so 1: ");
                outputStream.writeDouble(new Scanner(System.in).nextDouble());
                outputStream.flush();
                System.out.println("hay nhap vao so 2: ");
                outputStream.writeDouble(new Scanner(System.in).nextDouble());
                outputStream.flush();
                System.out.println("tong hai so la"+InputStream.readDouble());
                System.out.println("tiep tuc(y/n):");
                String traloi = new Scanner(System.in).nextLine();
                if (traloi.equals("n")||traloi.equals("N")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("loi "+e);
        }
    }
}
