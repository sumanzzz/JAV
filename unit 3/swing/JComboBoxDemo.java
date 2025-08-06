import javax.swing.*;
public class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Demo");
        String[] languages = {"Java","C++","Rust","Python"};
        JComboBox<String> combo = new JComboBox<>(languages);
        combo.setBounds(50,50,100,50);

        frame.add(combo);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
