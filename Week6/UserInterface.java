package Week6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserInterface extends JFrame {
    private static final long serialVersionUID = 1L;

    JPanel panel;
    JPanel southpanel;

    public UserInterface() {
        this.setSize(new Dimension(500, 500));
        this.setLayout(new BorderLayout());

        addGreetingPanel();
        addGreetingLabel();
        addGreetingTextField();
        addGreetingButton();

        addGreetingPanelsouth();
        addGreetingButton1();
        addGreetingButton2();
        addGreetingButton3 ();

    }

    private void addGreetingPanel() {
        panel = new JPanel();
        this.add(panel, BorderLayout.NORTH);
    }
    
    private void addGreetingLabel() {
        JLabel greetinglabel = new JLabel("Enter Greeting :");
        panel.add(greetinglabel);
    }
    
    private void addGreetingButton() {
        JButton greetingButton = new JButton("Display greeting");
        panel.add(greetingButton);
    }

    private void addGreetingTextField() {
        JTextField greetingTextField = new JTextField();
        greetingTextField.setPreferredSize(new Dimension(200, 50));
        panel.add(greetingTextField);
    }


    private void addGreetingPanelsouth() {
        southpanel = new JPanel();
        this.add(southpanel, BorderLayout.SOUTH);
    }
    
    private void addGreetingButton1() {
        JLabel greetinglabel = new JLabel("Enter name :");
        southpanel.add(greetinglabel);
    }
    
    private void addGreetingButton2() {
        JButton greetingButton = new JButton("submit");
        southpanel.add(greetingButton);
    }

    private void addGreetingButton3() {
        JTextField greetingTextField = new JTextField();
        greetingTextField.setPreferredSize(new Dimension(200, 50));
        southpanel.add(greetingTextField);
    }

    public static void main(String[] args) {
        UserInterface gui = new UserInterface();
        gui.setVisible(true);
    }
}