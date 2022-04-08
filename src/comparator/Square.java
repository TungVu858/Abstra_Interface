package comparator;

import resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    private double canh;
    public Square() {
    }

    public Square(double canh) {
        this.canh = canh;
    }

    public Square (double canh, String color){
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
    @Override
    public void resize(double percent) {
        this.canh  *= (percent / 200);
    }
}
