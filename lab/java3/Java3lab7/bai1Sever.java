/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java3lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class bai1Sever {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Sever is connecting ");
            Socket socket = serverSocket.accept();
            System.out.println("sever is conect");
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream InputStream = new DataInputStream(socket.getInputStream());
            while (true) {
                double number1 = InputStream.readDouble();
                double number2 = InputStream.readDouble();
                System.out.println("2 so nhan duoc tu client la" + number1+""+number2);
                double sum = number1+ number2;
                outputStream.writeDouble(sum);
                outputStream.flush();
                System.out.println("tong 2 so la"+sum);
                
            }
       } catch (Exception e) {
        }
    }
}
