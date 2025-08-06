import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class itemListner {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Radio Button Example with Dialog Box");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create radio buttons
        JRadioButton option1 = new JRadioButton("India");
        JRadioButton option2 = new JRadioButton("Germany");
        JRadioButton option3 = new JRadioButton("Japan");
        JRadioButton option4 = new JRadioButton("Italy");
        

        // Add radio buttons to a ButtonGroup to allow only one selection
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);

        // Add ItemListeners with JOptionPane dialog box
        option1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(frame, "India is selected", "Selection", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        option2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(frame, "Germany is selected", "Selection", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        option3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(frame, "Japan is selected", "Selection", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        option4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()==ItemEvent.SELECTED){
                    JOptionPane.showMessageDialog(frame, "Italy is selected", "Selection",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Add the radio buttons to the frame
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(option4);

        // Make the frame visible
        frame.setVisible(true);
    }
}
