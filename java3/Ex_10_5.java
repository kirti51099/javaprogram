// Java GUI program to demonstrate radiobuttons
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ex_10_5 extends JFrame implements ItemListener{
 JLabel l;
 JRadioButton r1,r2,r3;
 ButtonGroup b = new ButtonGroup();
 public Ex_10_5(){
 setTitle("RadioButton demo program");
 setLayout(null);
 l = new JLabel("Choose your favourite language");
 r1 = new JRadioButton("Java");
 r2 = new JRadioButton("ASP.net");
 r3 = new JRadioButton("SQL");
 l.setBounds(0,30,300,20);
 r1.setBounds(0,70,150,20);
 r2.setBounds(0,110,150,20);
 r3.setBounds(0,150,150,20);
 r1.addItemListener(this);
 r2.addItemListener(this);
 r3.addItemListener(this);
 add(l);
 b.add(r1);
 b.add(r2);
 b.add(r3);
 add(r1);
 add(r2);
 add(r3);
 setSize(500,500);
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void itemStateChanged(ItemEvent e){
 if(e.getSource() == r1)
 {
 if(e.getStateChange() == 1)
 {
 JOptionPane.showMessageDialog(this,"The Java option has been selected");
 }
 }
 if(e.getSource() == r2)
 {
 if(e.getStateChange() == 1)
 {
 JOptionPane.showMessageDialog(this,"The ASP.net option has been selected");
 }
 }
 if(e.getSource() == r3)
 {
 if(e.getStateChange() == 1)
 {
 JOptionPane.showMessageDialog(this,"The SQL option has been selected");
 }
 }
 }
 public static void main(String[] args){
 new Ex_10_5();

}
}
