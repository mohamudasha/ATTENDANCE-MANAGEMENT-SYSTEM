import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;


public class Design extends JFrame {
        public static void main(String[] args) {
            JPanel panel= new JPanel();
            JFrame frame = new JFrame("ATTENDANCE MANAGEMENT SYSTEM");
            frame.setLayout(new FlowLayout());
            frame.setSize(500, 500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            panel.setLayout(null);
            JLabel label= new JLabel("User");
            label.setBounds(10, 20, 80, 25);
            panel.add(label);






        }

                }






