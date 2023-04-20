import javax.swing.*;
import java.awt.event.*; 
import java.io.*; 

public class notepad{

    public notepad(){

        //create components
        JFrame f = new JFrame();
        JTextArea area = new JTextArea();

        //setting components
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
    
        //Menubar
        JMenu menu;  
        JMenuItem i1, i2, i3, i4, i5, i6;    
          
        JMenuBar mb = new JMenuBar();  
        menu = new JMenu("File");  
        i1 = new JMenuItem("New");  
        i2 = new JMenuItem("Open"); 
        i3 = new JMenuItem("Close");  
        i4 = new JMenuItem("Save");  
        i5 = new JMenuItem("Save As"); 
        i6 = new JMenuItem("Exit"); 

        menu.add(i1); 
        menu.add(i2); 
        menu.add(i3); 
        menu.addSeparator();
        menu.add(i4); 
        menu.add(i5); 
        menu.addSeparator();
        menu.add(i6);
        mb.add(menu);  
        f.setJMenuBar(mb);  

        //add components
        f.add(area);
        f.setSize(500,410);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String []args){
        notepad pad = new notepad();
    }

    
}