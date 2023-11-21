import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;

// 'Design' class that extends JFrame, used to create a GUI for an attendance management system
public class Design extends JFrame {
    // Main method - the entry point of the program
        public static void main(String[] args) {
            // Creating a JPanel to hold components
            JPanel panel= new JPanel();
            // Creating a JFrame with a title
            JFrame frame = new JFrame("ATTENDANCE MANAGEMENT SYSTEM");
            // Setting the size of the frame
            frame.setSize(500, 500);
            // Setting the default close operation to exit the application
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Adding the panel to the frame
            frame.add(panel);
            // Setting the layout of the panel to null for absolute positioning of components
            panel.setLayout(null);

            // Creating a label for the username
            JLabel userlabel= new JLabel("User");
            // Setting the position and size of the label
            userlabel.setBounds(10, 20, 80, 25);
            // Adding the label to the panel
            panel.add(userlabel);

            // Creating a text field for user input
            JTextField userText = new JTextField();
            // Setting the position and size of the text field
            userText.setBounds(100,20,165,25);
            // Adding the text field to the panel
            panel.add(userText);

            // Creating a label for the user ID
            JLabel userIDLabel= new JLabel("User ID");
            // Setting the position and size of the label
            userIDLabel.setBounds(10,50,80,25);
            // Adding the label to the panel
            panel.add(userIDLabel);

            // Creating a text field for user ID input
            JTextField userIDText = new JTextField();
            // Setting the position and size of the text field
            userIDText.setBounds(100,50,165,25);
            // Adding the text field to the panel
            panel.add(userIDText);

            // Creating a label for the password
            JLabel passwordLabel= new JLabel("Password");
            // Setting the position and size of the label
            passwordLabel.setBounds(10,80,80,25);
            // Adding the label to the panel
            panel.add(passwordLabel);

            // Creating a password field for password input
            JPasswordField passwordText=new JPasswordField();
            // Setting the position and size of the password field
            passwordText.setBounds(100,80,165,25);
            // Adding the password field to the panel
            panel.add(passwordText);

            // Making the frame visible
            frame.setVisible(true) ;

        }
                }






