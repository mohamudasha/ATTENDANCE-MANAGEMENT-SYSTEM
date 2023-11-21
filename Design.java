import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;


public class Design extends JFrame {
        public static void main(String[] args) {
            JPanel panel= new JPanel();
            JFrame frame = new JFrame("ATTENDANCE MANAGEMENT SYSTEM");
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            panel.setLayout(null);

            JLabel userlabel= new JLabel("User");
            userlabel.setBounds(10, 20, 80, 25);
            panel.add(userlabel);

            JTextField userText = new JTextField();
            userText.setBounds(100,20,165,25);
            panel.add(userText);

            JLabel userIDLabel= new JLabel("User ID");
            userIDLabel.setBounds(10,50,80,25);
            panel.add(userIDLabel);

            JTextField userIDText = new JTextField();
            userIDText.setBounds(100,50,165,25);
            panel.add(userIDText);

            JLabel passwordLabel= new JLabel("Password");
            passwordLabel.setBounds(10,80,80,25);
            panel.add(passwordLabel);

            JPasswordField passwordText=new JPasswordField();
            passwordText.setBounds(100,80,165,25);
            panel.add(passwordText);
            frame.setVisible(true) ;








        }

                }






