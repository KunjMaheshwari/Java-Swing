import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddtwoNumbers {
    public static void main(String args[]) {
        Addition obj = new Addition();
    }
}

class Addition extends JFrame {

    JTextField t1, t2;
    JButton b;
    JLabel l;

    // Create a constructor
    public Addition() {

        t1 = new JTextField(20); // Adding the text field
        t2 = new JTextField(20);
        b = new JButton("Ok"); // Adding button
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);
        //Functional interface -> One method declaration LAMBDA function
        b.addActionListener( ae -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
    
            int value = num1 + num2;    
            l.setText(value +""); 
        }); // Action Listener is an interface

        // basic swing code
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}