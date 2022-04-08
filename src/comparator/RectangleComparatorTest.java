package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle();
        rectangle[1] = new Rectangle(5,7);
        rectangle[2] = new Rectangle(4,6);
        System.out.println("Trước sắp xếp ");
        for (Rectangle rectangle1 : rectangle){
            System.out.println(rectangle1);
        }
        Comparator comparator = new RectangleComparator();
        Arrays.sort(rectangle,comparator);
        System.out.println("Sau sắp xếp ");
        for (Rectangle rectangle1 : rectangle){
            System.out.println(rectangle1);
        }
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(5);
        squares[2] = new Square(3,"vang");
        System.out.println("Trước xếp ");
        for (Square square : squares){
            System.out.println(square);
        }
        comparator = new SquareComparator();
        Arrays.sort(squares,comparator);
        System.out.println("Sau xếp ");
        for (Square square : squares){
            System.out.println(square);
        }
    }
}
