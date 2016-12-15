package test;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Surface extends JPanel { //Text is drawn in Surface which inherits JPannel

    private void doDrawing(Graphics g) {//Void function takes in g from Old graphics class

        Graphics2D g2d = (Graphics2D) g; //Extends the old Graphics class into the newer more advanced
        g2d.drawString("Hello World", 50, 50);//Draws string on the panel with the draw string method
    }

    @Override //paint component is overridden to allow super.paintCompnent to be called
    public void paintComponent(Graphics g) { //Custom painting is performed inside the paintComponent() method
    	super.paintComponent(g); //The super.paintComponent() method calls the method of the parent class, prepare a component for drawing
        doDrawing(g); //The drawing is delegated inside the doDrawing() method
    }
}

public class Example extends JFrame {

    public Example() {

        initUI();
    }

    private void initUI() { //initUI initiates the actual User Interface

        add(new Surface());//This is where the surface is added JFrame container

        setTitle("Java 2D");//Set title here
        setSize(300, 200);//Sets size of window
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {//The main method invokes the object with EventQueue, and runs the example object

        EventQueue.invokeLater(new Runnable() { //Invokes as runnable that queues the events

            @Override
            public void run() {
                Example ex = new Example();//Creates a new object of this example type
                ex.setVisible(true);//Sets the visibility of the created ex object to true
            }
        });
    }
}