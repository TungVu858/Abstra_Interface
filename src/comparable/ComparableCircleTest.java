package comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(8.5);
        circles[2] = new ComparableCircle(5.7, "green", true);
        System.out.println("Trước khi xếp : ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sau khi xếp : ");

        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
