//Java GUI program
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CounterGUI extends JFrame {
private JLabel countLabel;
private JButton countUpButton;
private JButton countDownButton;
private JButton resetButton;
private JButton controlButton;
private int count;
private boolean counting;
private Timer timer;
public CounterGUI() {
super("Counter");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
countLabel = new JLabel("0");
countUpButton = new JButton("Count Up");
countDownButton = new JButton("Count Down");
resetButton = new JButton("Reset");
controlButton = new JButton("Start");
countUpButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
count++;
updateCountLabel();
}
});
countDownButton.addActionListener(new ActionListener() {@Override
public void actionPerformed(ActionEvent e) {
count--;
updateCountLabel();
}
});
resetButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
count = 0;
updateCountLabel();
}
});
controlButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (counting) {
controlButton.setText("Start");
timer.stop();
counting = false;
} else {
controlButton.setText("Pause");
timer.start();
counting = true;
}
}
});
timer = new Timer(1000, new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
count++;updateCountLabel();
}
});
add(countLabel);
add(countUpButton);
add(countDownButton);
add(resetButton);
add(controlButton);
pack();
setLocationRelativeTo(null);
setVisible(true);
}
private void updateCountLabel() {
countLabel.setText(Integer.toString(count));
}
public static void main(String[] args) {
SwingUtilities.invokeLater(CounterGUI::new);
}
}
