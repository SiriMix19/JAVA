import javax.swing.*;  
class aa  
{  
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
          aa(){  
          JFrame f= new JFrame("Menu and MenuItem Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu=new JMenu("Sub Menu");  
          i4=new JMenuItem("Item 4");  
          i5=new JMenuItem("Item 5");  
          submenu.add(i4); submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new aa();  
}}  