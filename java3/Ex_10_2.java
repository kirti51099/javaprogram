
//Java GUI program using swing to change background on selecting color
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ex_10_2 extends JFrame implements ActionListener{
 JButton b1,b2,b3,b4;
 public Ex_10_2(){
 b1 = new JButton("RED");
 b2 = new JButton("YELLOW");
 b3 = new JButton("GREEN");
 b4 = new JButton("BLUE");

 b1.setBounds(50,100,80,30);
 b2.setBounds(150,100,80,30);
 b3.setBounds(250,100,80,30);
 b4.setBounds(350,100,80,30);
 add(b1);add(b2);add(b3);add(b4);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 setVisible(true);
 setLayout(new FlowLayout());
 setSize(700,700);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e){
 if(e.getSource() == b1)
 {
 getContentPane().setBackground(Color.RED);
 }
 else if(e.getSource() == b2)
 {
 getContentPane().setBackground(Color.YELLOW);
 }
 else if(e.getSource() == b3)
 {
 getContentPane().setBackground(Color.GREEN);
 }
 else
 {
 getContentPane().setBackground(Color.BLUE);
 }
 }
 public static void main(String[] args){
 new Ex_10_2();
 }
}
