
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Demo");
        JButton button = new JButton("click me");
        button.setBounds(500,500,200,30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame,"button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
