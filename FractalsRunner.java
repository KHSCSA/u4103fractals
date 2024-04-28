import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class FractalsRunner extends Canvas{

    // setup variables
    static int w, h;

    // setup the frame
    public static void main(String[] args){
        w = 600;
        h = 600;
        JFrame frame = new JFrame("Fractals using Recursion");
        Canvas canvas = new FractalsRunner(); // this must match the file/class name
        canvas.setSize(w,h);
        canvas.setBackground(new Color(255,255,255));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // close main


    // call your functions here
    public void paint(Graphics g){
        

    }



}