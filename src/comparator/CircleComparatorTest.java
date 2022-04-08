package comparator;

import comparable.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.5);
        circles[2] = new Circle(2,"red",true);
        System.out.println("Trước sắp xếp");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator comparator = new CircleComparator();
        Arrays.sort(circles,comparator);
        System.out.println("Sau sắp xếp");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
