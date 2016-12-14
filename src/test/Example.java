package test;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Surface extends JPanel { //Text is drawn in Surface which inherits JPannel

    private void doDrawing(Graphics g) {//Void function takes in g from Old graphics class

        Graphics2D g2d = (Graphics2D) g; //Extends the old Graphics class into the newer more advanced 
        g2d.drawString("Java 2D", 50, 50);//Draws string on the pannel with the draw string method
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class Example extends JFrame {

    public Example() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Simple Java 2D example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Example ex = new Example();
                ex.setVisible(true);
            }
        });
    }
}