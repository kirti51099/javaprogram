//3.Java GUI program using swing to add image at background
import javax.swing.*;
class Ex_10_3{
 JFrame f;
 ImageIcon img;
 JLabel l;
 public Ex_10_3(){
 img = new ImageIcon(this.getClass().getResource("/hummingbird.jpg"));
 l = new JLabel(img);
 l.setSize(600,800);
 f = new JFrame("Add Image Example");
 f.setSize(600,800);
 f.setLayout(null);
 f.add(l);
 f.setLocationRelativeTo(null);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String[] args){
 new Ex_10_3();
 }
}
