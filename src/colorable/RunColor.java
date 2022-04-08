package colorable;

import resizeable.Circle;
import resizeable.Rectangle;
import resizeable.Shape;
import resizeable.Square;

public class RunColor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.5);
        shapes[1] = new Rectangle(6,5);
        shapes[2] = new Square(7);
        for (Shape shape : shapes){
            shape.howToColor();
            System.out.println(shape);
        }
    }
}
