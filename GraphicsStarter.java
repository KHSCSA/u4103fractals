import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class GraphicsStarter extends Canvas{
    // variables for the Canvas size
    static int w, h;

    // setup the frame
    public static void main(String[] args){
        // the Canvas size
        w = 800;
        h = 600;
        // standard setup stuff
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new GraphicsStarter(); // this must match the file/class name
        canvas.setSize(w,h);
        canvas.setBackground(new Color(255,255,255));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // close main


    // this is where the action happens
    public void paint(Graphics g){

        g.setColor(new Color(255,0,0));
        //g.drawLine params are x1, y1, x2, y2
        g.drawLine(100,100,200,300);

        g.setColor(new Color(0,255,0));
        //g.drawRect params are top left x, y, width, height
        g.drawRect(300,300, 50, 100);

        g.setColor(Color.BLACK);
        //g.drawOval params are x, y, horiz_size, vert_size
        g.drawOval(400, 400, 100, 50); 
        
        
    } // close paint
  
    
} // close class
