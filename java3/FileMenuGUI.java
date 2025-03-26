//Java GUI program to create a file menu
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileMenuGUI extends JFrame {
 private JTextArea textArea;

 public FileMenuGUI() {
 setTitle("File Menu Example");
 setSize(400, 300);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setLocationRelativeTo(null);
 textArea = new JTextArea();
 JScrollPane scrollPane = new JScrollPane(textArea);
 getContentPane().add(scrollPane, BorderLayout.CENTER);
 JMenuBar menuBar = new JMenuBar();
 setJMenuBar(menuBar);
 JMenu fileMenu = new JMenu("File");
 menuBar.add(fileMenu);
 JMenuItem openMenuItem = new JMenuItem("Open");
 fileMenu.add(openMenuItem);
 openMenuItem.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 JFileChooser fileChooser = new JFileChooser();
 int result = fileChooser.showOpenDialog(FileMenuGUI.this);
 if (result == JFileChooser.APPROVE_OPTION) {
 File selectedFile = fileChooser.getSelectedFile();
 try (BufferedReader reader = new BufferedReader(new
FileReader(selectedFile))) {
 StringBuilder contents = new StringBuilder();
 String line;
 while ((line = reader.readLine()) != null) {
 contents.append(line).append("\n");
 }
 textArea.setText(contents.toString());
 } catch (IOException ex) {
 JOptionPane.showMessageDialog(FileMenuGUI.this, "Error reading file",
"Error", JOptionPane.ERROR_MESSAGE);
 }
 }
 }
 });
 }
 public static void main(String[] args) {
 SwingUtilities.invokeLater(new Runnable() {
 public void run() {
 new FileMenuGUI().setVisible(true);
 }
 });
 }
}
