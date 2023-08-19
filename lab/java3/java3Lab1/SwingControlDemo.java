/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3Lab1;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class SwingControlDemo {
 
 private JFrame mainFrame;
 private JLabel headerLabel;
 private JLabel statusLabel;
 private JPanel controlPanel;
 public SwingControlDemo(){
 prepareGUI();
 }
 
 public static void main(String[] args){
 SwingControlDemo swingControlDemo = new SwingControlDemo(); 
 swingControlDemo.showCheckBoxDemo();
 }
 
 private void prepareGUI(){
 mainFrame = new JFrame("Vi du Java Swing");
 mainFrame.setSize(500,500);
 mainFrame.setLayout(new GridLayout(3, 1));
 mainFrame.setLocationRelativeTo(null);
 mainFrame.addWindowListener(new WindowAdapter() {
     //Khi cửa sổ được đóng, phương thức windowClosing()
     //sẽ được gọi để thoát khỏi ứng dụng.
 public void windowClosing(WindowEvent windowEvent){
 System.exit(0);
 } 
 }); 
 headerLabel = new JLabel("", JLabel.CENTER); 
 statusLabel = new JLabel("",JLabel.CENTER); 
 statusLabel.setSize(350,100);
 controlPanel = new JPanel();
 controlPanel.setLayout(new FlowLayout());
 //Nó cho phép các thành phần được xếp theo hàng ngang hoặc hàng dọc,
// tùy thuộc vào không gian hiện có 
 mainFrame.add(headerLabel);
 mainFrame.add(controlPanel);
 mainFrame.add(statusLabel);
 mainFrame.setVisible(true); 
 }
 
 private void showCheckBoxDemo(){
 headerLabel.setText("Control in action: CheckBox");
 final JCheckBox chkApple = new JCheckBox("Apple");
 final JCheckBox chkMango = new JCheckBox("Mango");
 final JCheckBox chkPeer = new JCheckBox("Peer");
 
 //tao phim tat alt + c 
 chkApple.setMnemonic(KeyEvent.VK_A);
 chkMango.setMnemonic(KeyEvent.VK_M);
 chkPeer.setMnemonic(KeyEvent.VK_P);
 chkApple.addItemListener(new ItemListener() {
     //Thêm một ItemListener vào chkApple để lắng nghe sự kiện 
     //thay đổi trạng thái của chkApple.
 public void itemStateChanged(ItemEvent e) { 
//    Định nghĩa phương thức itemStateChanged từ giao diện ItemListener.
//    Phương thức này được gọi khi trạng thái của chkApple thay đổi.
 statusLabel.setText("Apple Checkbox: "
 + (e.getStateChange()==1?"checked":"unchecked"));
 } 
 });
 chkMango.addItemListener(new ItemListener() {
 public void itemStateChanged(ItemEvent e) { 
 statusLabel.setText("Mango Checkbox: "
 + (e.getStateChange()==1?"checked":"unchecked"));
 } 
 });
 chkPeer.addItemListener(new ItemListener() {
 public void itemStateChanged(ItemEvent e) { 
 statusLabel.setText("Peer Checkbox: "
 + (e.getStateChange()==1?"checked":"unchecked"));
 } 
 });
 controlPanel.add(chkApple);
 controlPanel.add(chkMango);
 controlPanel.add(chkPeer); 
 mainFrame.setVisible(true); 
 }
}

