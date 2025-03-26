import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame implements ActionListener {
    private JPanel buttonPanel;
    private JButton[] buttons;

    public GridLayoutDemo() {
        super("GridLayout Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 3)); // Initially arranged horizontally

        buttons = new JButton[6];
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        buttonPanel.setLayout(new GridLayout(3, 2)); // Rearranged vertically
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}