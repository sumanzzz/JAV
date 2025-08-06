import javax.swing.*;
import java.awt.event.*;

public class mouseEvent extends JFrame implements MouseListener {
    JLabel label;

    public mouseEvent() {
        label = new JLabel("Mouse Event Example");
        label.setBounds(50, 50, 200, 50);
        add(label);

        addMouseListener(this);

        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked!");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released");
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited");
    }

    public static void main(String[] args) {
        new mouseEvent();
    }
}
