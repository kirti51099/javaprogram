//Write Java GUI calculator program using Swing
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ex_8_3 extends JFrame implements ActionListener{
 JLabel l1,l2,l3;
 JTextField t1,t2,t3;
 JButton ba,bs,bm,bd,bmo,bc;
 GridLayout g;
 Panel p;
 public Ex_8_3(){
 setTitle("Swing Arithmetics");
 l1 = new JLabel("First Number");
 l2 = new JLabel("Second Number");
 l3 = new JLabel("Result");
 t1 = new JTextField(20);
 t2 = new JTextField(20);
 t3 = new JTextField(20);
 ba = new JButton("+");
 bs = new JButton("-");
 bm = new JButton("*");
 bd = new JButton("/");
 bmo = new JButton("%");
 bc = new JButton("CLEAR");
 setLayout(new FlowLayout());
 g = new GridLayout(6,2);
 p = new Panel();
 //p2 = new Panel();
 p.setLayout(g);
 //p2.setLayout(g);
 //add(p1);
 add(p);
 p.add(l1);p.add(t1);p.add(l2);p.add(t2);p.add(l3);p.add(t3);
 p.add(ba);p.add(bs);p.add(bm);p.add(bd);p.add(bmo);p.add(bc);
 p.setVisible(true);
 p.setSize(400,400);
 ba.addActionListener(this);
 bs.addActionListener(this);
 bm.addActionListener(this);
 bd.addActionListener(this);
 bmo.addActionListener(this);
 bc.addActionListener(this);
 setVisible(true);
 setSize(400,400);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e){
 int n1 = Integer.parseInt(t1.getText());
 int n2 = Integer.parseInt(t2.getText());
 int result;
 if(e.getSource() == ba)
 {
 result = n1+n2;
 t3.setText(String.valueOf(result));
 }
 if(e.getSource() == bs)
 {
 result = n1-n2;
 t3.setText(String.valueOf(result));
 }
 if(e.getSource() == bm)
 {
 result = n1*n2;
 t3.setText(String.valueOf(result));
 }
 if(e.getSource() == bd)
 {
 result = n1/n2;
 t3.setText(String.valueOf(result));
 }
 if(e.getSource() == bmo)
 {
 result = n1%n2;
 t3.setText(String.valueOf(result));
 }
 if(e.getSource() == bc)
 {
 t1.setText(String.valueOf(""));
 t2.setText(String.valueOf(""));
 t3.setText(String.valueOf(""));
 }
 }
 public static void main(String[] args){
 new Ex_8_3();
 }
}
