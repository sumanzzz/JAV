import javax.swing.*;


public class CheckBoxDemo {
        public static void main(String[] args) {
            JFrame frame = new JFrame("JCheckBox Demo");
            JCheckBox cb1 = new JCheckBox("option 1");
            JCheckBox cb2 = new JCheckBox("option 2");
            cb1.setBounds(50,50,200,20);
            cb2.setBounds(100,100,200,20);


            frame.add(cb1);
            frame.add(cb2);
            frame.setSize(300,300);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
