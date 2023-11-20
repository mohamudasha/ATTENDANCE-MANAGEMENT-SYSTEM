import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design extends JFrame {
        public static void main(String[] args) {
            JFrame frame = new JFrame("ATTENDANCE MANAGEMENT SYSTEM");
            String name1=JOptionPane.showInputDialog("Enter your Student ID");
            String name2=JOptionPane.showInputDialog("Enter date");
            JOptionPane.showMessageDialog(null,"Attendance recorded successfully");
            JButton button1 = new JButton("Student ID");
            frame.add(button1);
            JButton button2 = new JButton("Password");
            frame.add(button2);
            frame.setLayout(new FlowLayout());
            frame.setSize(290, 200);
            frame.setVisible(true);
        }

                }






