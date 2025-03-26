import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea resultArea;

    public BorderLayoutExample() {
        super("Number System Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        inputField = new JTextField();
        panel.add(inputField, BorderLayout.NORTH);

        resultArea = new JTextArea();
        panel.add(resultArea, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));

        JButton binaryButton = new JButton("Binary");
        binaryButton.addActionListener(this);
        buttonPanel.add(binaryButton);

        JButton hexButton = new JButton("Hexa");
        hexButton.addActionListener(this);
        buttonPanel.add(hexButton);

        JButton octalButton = new JButton("Octal");
        octalButton.addActionListener(this);
        buttonPanel.add(octalButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        String input = inputField.getText();
        int number;

        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid input. Please enter a valid integer.");
            return;
        }

        switch (choice) {
            case "Binary":
                resultArea.setText("Binary: " + Integer.toBinaryString(number));
                break;
            case "Hexa":
                resultArea.setText("Hexadecimal: " + Integer.toHexString(number));
                break;
            case "Octal":
                resultArea.setText("Octal: " + Integer.toOctalString(number));
                break;
            default:
                resultArea.setText("Invalid choice.");
                break;
        }
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}