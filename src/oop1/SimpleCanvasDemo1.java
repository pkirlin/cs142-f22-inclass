package oop1;

import java.awt.*;

public class SimpleCanvasDemo1 {
    public static void main(String[] args) {

        // Declare a new SimpleCanvas variable called canvas.
        SimpleCanvas c;

        // Instantiate a new SimpleCanvas object by calling a constructor.
        // This creates a new instance of the SimpleCanvas class, and assigns
        // that instance to the canvas variable.
        c = new SimpleCanvas(400, 200, "My Canvas");

        // Note that we could have done both lines together:
        // SimpleCanvas canvas = new SimpleCanvas(400, 200, "My Canvas");

        // Invoke some instance methods that operate on the canvas.
        c.setPenColor(Color.BLUE);
        c.drawFilledRectangle(100, 50, 50, 100);
        c.setPenColor(Color.RED);
        c.setLineThickness(5);
        c.drawCircle(300, 100, 50);
        c.show();
    }
}
