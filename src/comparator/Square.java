package comparator;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double canh) {
        super(canh, canh);
    }
    public Square (double canh,String color){
        super(canh,canh,color);
    }
    public double getCanh() {
        return getRong();
    }

    public void setCanh(double canh) {
        setDai(canh);
        setRong(canh);
    }
    @Override
    public void setDai(double dai) {
        setCanh(dai);
    }

    @Override
    public void setRong(double rong) {
        setCanh(rong);
    }

    @Override
    public String toString() {
        return "Square {dai=" +getCanh()+ " , color= "+ getColor()+" } " +"Area " + setArea();
    }
}
