//4.Write Java GUI program to demonstrate itemevent and keyevent
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ex_10_4 extends JFrame implements ItemListener,KeyListener{
 JTextField t;
 JCheckBox cb;
 public Ex_10_4(){
 setTitle("ItemEvent and KeyEvent Example");
 setSize(500,500);
 setVisible(true);
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 t = new JTextField(20);
 cb = new JCheckBox("Enable TextField");
 t.addKeyListener(this);
 cb.addItemListener(this);
 add(cb);add(t);
 }
 public void itemStateChanged(ItemEvent e){
 if(e.getSource() == cb)
 {
 t.setEnabled(cb.isSelected());
 }
 }
 public void keyPressed(KeyEvent e)
 {
 System.out.println("Key pressed : "+e.getKeyChar());
 }
 public void keyReleased(KeyEvent e){
 System.out.println("Key released : "+e.getKeyChar());
 }
 public void keyTyped(KeyEvent e){
 System.out.println("Key typed : "+e.getKeyChar());
 }
 public static void main(String[] args){
 new Ex_10_4();
 }
}
