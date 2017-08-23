package Graphics;
import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(50,20,50,100);  // draw a rectangle
        g.fillOval(200,400,40,80); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.fillRect(600, 400, 100,100);

        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 200, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}

//Questions:
//How big is the window that appears? How many pixels wide? How many pixels tall? 800px wide; 600px tall

//In the call to the function g.drawRect(), there are four numbers. What do they mean? Try changing them to figure
// it out. X and Y are the positions in the space of the frame. Width and height control how wide or high the shape is.

//What about the call to fillOval()? What do the four numbers mean here?  X and Y are the position in the space of
// the frame. Width and height control how wide or high the shape is.

//What are the two numbers in the call to drawString()? X and Y are positions in the space of the frame

//What happens when two objects overlap? Which one is drawn on top? The filled one is drawn on top. The further
// down the code the shape is, that will be the one drawn on top for two filled in shapes.

//Add a red, filled-in square somewhere in the lower-right of the canvas.