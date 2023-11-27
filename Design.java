import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Design extends JFrame implements ActionListener {
        private static JLabel userlabel;
        private static JTextField userText;
        private static JLabel userIDLabel;
        private static JTextField userIDText;
        private static JLabel passwordLabel;
        private static JTextField passwordText;
        private static JButton button;
        private static JLabel success;
        public static void main(String[] args) {
            JPanel panel= new JPanel();
            JFrame frame = new JFrame("ATTENDANCE MANAGEMENT SYSTEM");
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            panel.setLayout(null);

            userlabel= new JLabel("User");
            userlabel.setBounds(10, 20, 80, 25);
            panel.add(userlabel);

            userText = new JTextField();
            userText.setBounds(100,20,165,25);
            panel.add(userText);

            userIDLabel= new JLabel("User ID");
            userIDLabel.setBounds(10,50,80,25);
            panel.add(userIDLabel);

            userIDText = new JTextField();
            userIDText.setBounds(100,50,165,25);
            panel.add(userIDText);

            passwordLabel= new JLabel("Password");
            passwordLabel.setBounds(10,80,80,25);
            panel.add(passwordLabel);

            passwordText=new JPasswordField();
            passwordText.setBounds(100,80,165,25);
            panel.add(passwordText);

            button=new JButton("Login");
            button.setBounds(100,120,80,25);
            button.addActionListener(new Design());
            panel.add(button);

            success=new JLabel("");
            success.setBounds(100,150,300,25);
            panel.add(success);
            frame.setVisible(true) ;

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user=userText.getText();
        String userID=userIDText.getText();
        String password= passwordText.getText();
        System.out.println(user+"," + userID +","+password);
        if(user.equals("Urvi") && userID.equals("A1234") && password.equals("4321")){
            success.setText("Login successful!");}
            else success.setText("Login failed!");
        System.out.println(user+"," + userID +","+password);
        if(user.equals("Terry") && userID.equals("A1235") && password.equals("#20213")){
            success.setText("Login successful!");}
        else success.setText("Login failed!");
        System.out.println(user+"," + userID +","+password);
        if(user.equals("Vicky") && userID.equals("A1236") && password.equals("5050*")){
            success.setText("Login successful!");}
        else success.setText("Login failed!");
        System.out.println(user+"," + userID +","+password);
        if(user.equals("Susan") && userID.equals("13456") && password.equals("Haiya")){
            success.setText("Login successful!");}
        else success.setText("Login failed!");
        if(user.equals("Joan") && userID.equals("13457") && password.equals("What(!)")){
            success.setText("Login successful!");}
        else success.setText("Login failed!");
        if(user.equals("Leah") && userID.equals("13458") && password.equals("Y@")){
            success.setText("Login successful!");}
        else success.setText("Login failed!");

        }
    }







