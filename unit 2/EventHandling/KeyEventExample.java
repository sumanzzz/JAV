import javax.swing.*;
import java.awt.event.*;

public class KeyEventExample extends JFrame implements KeyListener {
    JLabel label;

    public KeyEventExample() {
        label = new JLabel("Type something...");
        label.setBounds(50, 50, 200, 50);
        add(label);

        addKeyListener(this);

        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
       System.out.println("key released");
    }
    public void keyTyped(KeyEvent e) {
        System.out.println("key Typed");
    }

    public static void main(String[] args) {
        new KeyEventExample();
    }
}
