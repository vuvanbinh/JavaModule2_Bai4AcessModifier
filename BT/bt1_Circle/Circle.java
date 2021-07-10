package bai5_AcessModifier.BT.bt1_Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final double PI = 3.14;

    public Circle(){
    }
    public Circle(double r){
       radius = r;
    }

    double getRadius() {
        return radius;
    }
    double getArea(){
        return PI*radius*radius;
    }
}
