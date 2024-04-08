import javax.swing.*;
import java.awt.FlowLayout;


public class HelloWorld{
    public static void main(String args[]){
        Abc obj = new Abc();
        obj.setSize(400, 400);
        obj.setVisible(true);
    }
}

class Abc extends JFrame{  // JFrame is used to create the main frame of the java application and JFrame follows Card Layout
    public Abc(){
        
        JLabel l = new JLabel("Hello World");  //JLabel is used to enter the text inside the main frame
        JLabel l1 = new JLabel("Welcome Kunj");
        
        add(l);
        add(l1);

        // Write these lines in every swing code
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}