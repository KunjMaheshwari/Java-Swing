import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseDemo {
    public static void main(String[] args) {
        Xyz obj = new Xyz();
    }
}

class Xyz extends JFrame{
    public Xyz(){

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                int x = e.getX();
                int y = e.getY();

                System.out.println(x +" , "+ y);
            }
        });
        

        // basic swing code
        setLayout( new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}