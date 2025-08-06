import java.io.FileReader;

import javax.swing.*;

public class JLabelDemo{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JLabel Example");
        JLabel label = new JLabel("Hello,JLabel Here!");
        label.setBounds(50,50,200,20);
        

        frame.add(label);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}