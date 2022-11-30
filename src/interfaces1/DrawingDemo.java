package interfaces1;

import java.awt.*;
import java.util.ArrayList;

public class DrawingDemo {
    public static void main(String[] args)
    {
        Circle circle = new Circle(50, Color.RED);
        Square square = new Square(60, Color.BLUE);
        Dog fido = new Dog("Fido", 2);
        ShowDog lassie = new ShowDog("Lassie", 5);
        Cat snowball = new Cat("Snowball", 3);

        // Write code here to make an arraylist and add the
        // objects we want to draw into the arraylist.
        ArrayList<Drawable> stuffToDraw = new ArrayList<Drawable>();
        stuffToDraw.add(circle);
        stuffToDraw.add(square);
        stuffToDraw.add(fido);
        stuffToDraw.add(lassie);

        // Call the drawAllObjects function.
        drawAllObjects(stuffToDraw);
    }

    public static void drawAllObjects(ArrayList<Drawable> list)
    {
        SimpleCanvas canvas = new SimpleCanvas(500, 500);
        canvas.show();

        for (Drawable d : list) {
            int randomLocation = (int)(Math.random() * 500);
            d.drawOn(canvas, randomLocation, randomLocation);
        }
        canvas.update();
    }
}
