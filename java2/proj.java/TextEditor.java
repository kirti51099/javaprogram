import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
//import javax.swing.JComboBox;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TextEditor<changeEvent> extends JFrame implements ActionListener
 {
    JTextArea textArea;
    JScrollPane scrollPane;                               
    JLabel fontlable;                                                       
    JSpinner fontSizeSpinner;
    JButton fontColorButton;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    //@SuppressWarnings("rawtypes")
    //JComboBox fontBox;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem OpenItem;
    JMenuItem saveItem;
    JMenuItem exitItem;



    TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("text Editor");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        textArea = new JTextArea();
        //textArea.setPreferredSize(new Dimension(450,450));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial",Font.PLAIN,20));

        scrollPane=new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(450,450));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        fontlable=new JLabel("Font:");

        fontSizeSpinner=new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(50,25));
        fontSizeSpinner.setValue(20);
        fontSizeSpinner.addChangeListener(new ChangeListener()
        {

            public void stateChanged(changeEvent e)
            {
                textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN,(int)fontSizeSpinner.getValue()));

            }

            @Override
            public void stateChanged(ChangeEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'stateChanged'");
            }
        });

        fontColorButton=new JButton("Color");
        fontColorButton.addActionListener(this);
        
        //String[] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        //fontBox=new JComboBox(fonts);
        //fontBox.addActionListener(this);
        //fontBox.setSelectedItem("Arial");
        //-------menubar------
        menuBar=new JMenuBar();
        fileMenu=new JMenu("File");
        OpenItem=new JMenuItem("open");
        saveItem=new JMenuItem("save");
        exitItem=new JMenuItem("exit");

        OpenItem.addActionListener(this);
        OpenItem.addActionListener(this);
        OpenItem.addActionListener(this);


        fileMenu.add(OpenItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
       
        
        
        

        //fontColorButton=new JButton("Color");
        //fontColorButton.addActionListener(this);
        
        //String[] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        //fontBox=new JComboBox(fonts);
        //fontBox.addActionListener(this);
        //fontBox.setSelectedItem("Arial");

        this.setJMenuBar(menuBar);
        this.add(fontlable);
        this.add(fontSizeSpinner);
        this.add(fontColorButton);
        //this.add(fontBox);
        this.add(scrollPane);
       // JLable fontlable;
        this.setVisible(true);



    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==fontColorButton)
        {
            JColorChooser colorChooser=new JColorChooser(); 

            Color color=JColorChooser.showDialog(null,"Choose a color",Color.black);

            textArea.setForeground(color);
        }
        if(e.getSource()==OpenItem)
        {

        }
        if(e.getSource()==saveItem)
        {
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));

            int response=fileChooser.showSaveDialog(null);

            if(response==JFileChooser.APPROVE_OPTION)
            {
                File file;
                PrintWriter fileout=null;

                file=new File(fileChooser.getSelectedFile().getAbsolutePath());
               
               try{
                fileout=new PrintWriter(file);
                fileout.println(textArea.getText());
               }
               catch(FileNotFoundException e1)
               {
                e1.printStackTrace();
               }
               finally
               {
                    fileout.close();
               }
            }
        }
        if(e.getSource()==exitItem)
        {
            System.exit(0);
        }

    }
}


       
    