import javax.swing.*;

public class JTextFieldDemo {
    public static void main(String[] args) {
        JFrame frame = new  JFrame("JTextField Demo");
        JTextField tf = new JTextField("Type here....");
        tf.setBounds(0 ,0, 300, 20);

        frame.add(tf);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
