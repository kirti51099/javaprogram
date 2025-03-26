//Java GUI program using swing to find given number is prime or not
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PrimeCheckerGUI extends JFrame {
private JTextField numberField;
private JButton checkButton;
private JLabel resultLabel;
public PrimeCheckerGUI() {
setTitle("Prime Number Checker");
setSize(300, 150);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(3, 1));
numberField = new JTextField();
numberField.setHorizontalAlignment(JTextField.CENTER);
checkButton = new JButton("Check");
checkButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String input = numberField.getText();
try {
int number = Integer.parseInt(input);
boolean isPrime = isPrime(number);
if (isPrime) {
resultLabel.setText(number + " is a prime number.");
} else {
resultLabel.setText(number + " is not a prime number.");
}
} catch (NumberFormatException ex) {
resultLabel.setText("Please enter a valid integer.");
}}
});
resultLabel = new JLabel();
resultLabel.setHorizontalAlignment(JLabel.CENTER);
panel.add(new JLabel("Enter a number:"));
panel.add(numberField);
panel.add(checkButton);
panel.add(resultLabel);
add(panel);
}
private boolean isPrime(int number) {
if (number <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(number); i++) {
if (number % i == 0) {
return false;
}
}
return true;
}
public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
new PrimeCheckerGUI().setVisible(true);
});
}
}
