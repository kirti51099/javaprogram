//GUI Program using swing to find reverse of a number
import javax.swing.*;
 class reverse {
 public static void main(String[] args) {
 int n,remainder;
 int result = 0;
 String numInput;
 numInput = JOptionPane.showInputDialog(null, "Enter a number:");
n = Integer.parseInt(numInput);
 while(n>0){
 remainder = n%10;
 result = result * 10 + remainder;
 n = n/10;
 }
 JOptionPane.showMessageDialog(null, "Reverse number is: " +result);
 }
}