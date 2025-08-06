import javax.swing.*;

public class JListDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList demo");
        
        String[] languages={"Java","C++","Python","Rust"};

        JList<String> list = new JList<>(languages);
        list.setBounds(50,50,100,100);

        frame.add(list);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
