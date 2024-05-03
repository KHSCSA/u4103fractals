import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Polygon;

public class Functions {
    public static Color getColor(){
        int randR = (int)(Math.random()*256);
        int randG = (int)(Math.random()*256);
        int randB = (int)(Math.random()*256);
        Color randCol = new Color(randR, randG, randB);
        return randCol;
    }
    


    public static void drawHorizLines(Graphics g, , int x1, int y1, int size){


    }


        
    public static void drawSierpinski(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){

    
    } // close method
    
  

    

    public static void drawSierpinskiCarpet(Graphics g, Color c, int x, int y, int size){
        //draw the 'main' square in the center


        //draw the eight sub-squares around it
  
    
    } // close method
    
    
    
    public static void delay(int n){
        try{
            Thread.sleep(n);
        }
        catch (InterruptedException e){}
    }
    

} // close class
