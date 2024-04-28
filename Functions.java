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
    

    public static void drawH(Graphics g, int x, int y, int size, Color col){
        g.setColor(col);
        g.drawLine(x-size/2, y, x+size/2, y);
        g.drawLine(x-size/2, y-size/2, x-size/2, y+size/2);
        g.drawLine(x+size/2, y-size/2, x+size/2, y+size/2);
        delay(10);
        if (size>10){
            Color randCol = getColor();
            drawH(g, x+size/2, y-size/2, size/2, randCol);
            drawH(g, x+size/2, y+size/2, size/2, randCol);
            drawH(g, x-size/2, y+size/2, size/2, randCol);
            drawH(g, x-size/2, y-size/2, size/2, randCol);
        }
    } // close method


    
    public static void drawIllusion(Graphics g, int x1, int y1, int x2, int y2){ 
        g.drawLine(x1, y1, x2, y2);
        delay(200);
        if(y1<y2){
            y1+=10;
            x2+=10;
            drawIllusion(g, x1, y1, x2, y2);
        }
    } // close method
    
    
    public static void drawSquare(Graphics g, int x1, int y1, int size){
        g.drawRect(x1, y1, size, size);
        if(size>5){
            size/=2;
            drawSquare(g, x1, y1, size);
        }
    } // close method
    

    public static void drawSquare2(Graphics g, int x1, int y1, int size){
        g.drawRect(x1, y1, size, size);
        if(size>10){
            size-=20;
            x1+=10;
            y1+=10;
            drawSquare2(g, x1, y1, size);
        }
    } // close method
    

    public static void drawSierpenskiCarpet(Graphics g, Color c, int x, int y, int size){
        //draw the 'main' square in the center
        int sub = size/3;
    
        g.setColor(c);
        g.fillRect(x+sub, y+sub, sub, sub);
        //delay(1);
        //draw the eight sub-squares around it
        if(size > 2){
            Color randCol = getColor();
            drawSierpenskiCarpet(g, temp, x, y, sub);
            drawSierpenskiCarpet(g, temp, x+sub, y, sub);
            drawSierpenskiCarpet(g, temp, x+2*sub, y, sub);
        
            drawSierpenskiCarpet(g, temp, x, y+sub, sub);
            drawSierpenskiCarpet(g, temp, x+2*sub, y+sub, sub);
        
            drawSierpenskiCarpet(g, temp, x, y+2*sub, sub);
            drawSierpenskiCarpet(g, temp, x+sub, y+2*sub, sub);
            drawSierpenskiCarpet(g, temp, x+2*sub, y+2*sub, sub);
        } // close if
    
    } // close method
    


    public static void drawSierpenskiCarpetBW(Graphics g, int x, int y, int size){
        // draw the 'main' square in the center
        int sub = size/3;
        g.fillRect(x+sub, y+sub, sub, sub);
    
        // draw the eight sub-squares around it
        if(size > 1){
            drawSierpenskiCarpetBW(g, x, y, sub);
            drawSierpenskiCarpetBW(g, x+sub, y, sub);
            drawSierpenskiCarpetBW(g, x+2*sub, y, sub);
        
            drawSierpenskiCarpetBW(g, x, y+sub, sub);
            drawSierpenskiCarpetBW(g, x+2*sub, y+sub, sub);
        
            drawSierpenskiCarpetBW(g, x, y+2*sub, sub);
            drawSierpenskiCarpetBW(g, x+sub, y+2*sub, sub);
            drawSierpenskiCarpetBW(g, x+2*sub, y+2*sub, sub);
        } // close if
    
    } // close method
    
    
    public static void drawSierpenski(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        int x4 = (x1+x3)/2;
        int y4 = (y1+y3)/2;
        int x5 = (x1+x2)/2;
        int y5 = (y1+y2)/2;
        int x6 = (x2+x3)/2;
        int y6 = (y2+y3)/2;
    
        Polygon poly = new Polygon();
        poly.addPoint(x4, y4);
        poly.addPoint(x5, y5);
        poly.addPoint(x6, y6);
        g.fillPolygon(poly);
    
        if(Math.abs(x1-x4)>2){
            drawSierpenski(g, x1, y1, x4, y4, x5, y5);
            drawSierpenski(g, x5, y5, x2, y2, x6, y6);
            drawSierpenski(g, x4, y4, x6, y6, x3, y3);
        }
    
    } // close method
    
    
    public static void delay(int n){
        try{
            Thread.sleep(n);
        }
        catch (InterruptedException e){}
    }
    

} // close class
