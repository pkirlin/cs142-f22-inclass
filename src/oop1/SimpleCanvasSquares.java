package oop1;

import java.awt.*;

public class SimpleCanvasSquares {
    public static void main(String[] args) {

        // Use SimpleCanvas to open a new canvas and draw
        // a concentric square design similar to this:
        // https://www.levygorvy.com/works/frank-stella/

        SimpleCanvas canvas = new SimpleCanvas(500, 500);
        canvas.drawFilledRectangle(100, 100, 300, 300);
        canvas.show();

    }
}