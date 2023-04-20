import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;

public class Newpjv2 {
    public static boolean isValidUser(String email, String password) {
        return email.equals("sisisi") && password.equals("si29440");
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");
        
        //Background
        JPanel panel = new JPanel();
        panel.setBounds(55, 70, 270, 270);
        panel.setBackground(new Color(0xE4E4E4));

        // text label
        JLabel a1, a2, a3, n1;
        a1 = new JLabel("Log in to Finviz");
        a1.setBounds(98, 10, 250, 30);
        a1.setFont(new Font("Mali", Font.BOLD, 25));
        a2 = new JLabel("Don't have an account?");
        a2.setBounds(60, 37, 140, 30);
        n1 = new JLabel("Register here, It's free");
        n1.setBounds(195, 37, 150, 30);
        n1.setForeground(new Color(0x4FA4F4));

        // set hyperlink by use a2
        n1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        n1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("http://www.google.com"));
                    } catch (IOException | URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        a3 = new JLabel("I forgot my password"); // add hyperlink to labe3
        a3.setBounds(127, 300, 150, 30);
        a3.setForeground(new Color(0x4FA4F4));

        // set link by use a3
        a3.setCursor(new Cursor(Cursor.HAND_CURSOR)); // set cursor to hand
        a3.addMouseListener(new MouseAdapter() { // add mouse listener to open hyperlink
            public void mouseClicked(MouseEvent e) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("http://www.google.com"));
                    } catch (IOException | URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        // l2&t1
        JTextField t1;
        JLabel l2 = new JLabel("Your email:");
        l2.setBounds(80, 72, 80, 30);
        t1 = new JTextField();
        t1.setBounds(80, 100, 220, 35);

        // l1
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Your password:");
        l1.setBounds(80, 142, 100, 30);
        value.setBounds(80, 170, 220, 35);

        // checkBox1
        JCheckBox checkBox1 = new JCheckBox("Remember me on this computer.");
        checkBox1.setBounds(76, 222, 212, 20);
        checkBox1.setBackground(new Color(0xE4E4E4));

        // Button
        JButton b = new JButton("Log in");
        b.setBounds(100, 258, 180, 35);
        b.setForeground(Color.white);
        b.setBackground(new Color(0x4FA4F4));
        b.setBorder(null);

        // Add hover effect to the button
        b.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b.setBackground(new Color(0x438AFF));
            }

            public void mouseExited(MouseEvent e) {
                b.setBackground(new Color(0x4FA4F4));
            }
        });

        // Login POPUP
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get the values from the email and password fields
                String email = t1.getText();
                String password = new String(value.getPassword());

                // check if the email and password are valid
                if (isValidUser(email, password)) {
                    JOptionPane.showMessageDialog(f, "Login successful");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid email or password");
                }
            }
        });
        // Add Value
        f.add(value);
        f.add(l1);
        f.add(l2);
        f.add(checkBox1);
        f.add(t1);
        f.add(b);
        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.add(n1);

        // Set Frame Size
        f.setLocationRelativeTo(null);
        f.add(panel);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}