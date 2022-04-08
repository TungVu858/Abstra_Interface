package resizeable;

public class UpSezi {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5,"green",true);
        shapes[1] = new Rectangle(6,5,"vàng",false);
        shapes[2] = new Square(5);
        System.out.println("Trước thay đổi ");
        for (Shape shape : shapes){
            System.out.println(shape);
        }
        System.out.println("Sau thay đổi ");
        for (Shape shape : shapes){
            shape.resize(Math.random()*1000);
            System.out.println(shape);
        }
    }
}
