import javax.swing.*;

public class radioButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton Demo");
        JRadioButton rb1 =new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("female");
        rb1.setBounds(50,50,100,30);
        rb2.setBounds(50,100,100,30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        frame.add(rb1);
        frame.add(rb2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
