package comparator;

public class Rectangle {
    private double dai;
    private double rong;
    private String color= "red";

    public Rectangle() {
    }

    public Rectangle(double dai, double rong, String color) {
        this.dai = dai;
        this.rong = rong;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    public double setArea(){
        return this.dai*this.rong;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "dai=" + dai +
                ", rong=" + rong +
                ", color='" + color + '\'' +
                '}' + " Area " + setArea();
    }
}
