import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame {


    private static final long serialVersionUID = 1L;
    private GridBagConstraints constraints;

    public GUI() {
        this.setSize(500, 500);
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        constraints = new GridBagConstraints();

        addHeadingLabel();
        addTypeLabel();
        addDropdown();
        addNameLabel();
        addTextboxname();
        addage();
        addagedropdown();
        addsubmit();
    }

    private void addHeadingLabel() {
        JLabel headingLabel = new JLabel("Living Things");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;

        this.add(headingLabel, constraints);
    }

    private void addTypeLabel() {
        JLabel typeLabel = new JLabel("Type : ");

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;

        this.add(typeLabel, constraints);
    }
    private void addDropdown() {
        JComboBox list = new JComboBox<>();
        list.addItem("HUMAN");
        list.addItem("Plant");
        list.addItem("Animal");

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;

        this.add(list, constraints);
    }
    private void addNameLabel() {
        JLabel headingLabel = new JLabel("Name : ");

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;

        this.add(headingLabel, constraints);
    }
    private void addTextboxname() {
        JTextField nametextbox = new JTextField(" Enter The Name !");

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;

        this.add(nametextbox, constraints);
    }
    private void addage() {
        JLabel agelabel = new JLabel("Age : ");

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;

        this.add(agelabel, constraints);
    }
    private void addagedropdown() {
        JTextField agetextbox = new JTextField(" Enter The Age !");

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;

        this.add(agetextbox, constraints);
    }
    private void addsubmit() {
        JButton buttonsubmit = new JButton("submit");

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;

        this.add(buttonsubmit, constraints);
    }



    public static void main(String[] args)
    {
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}
