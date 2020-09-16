package Nasledovanie;

public class Krugimpl implements Circle {

    double radius;

    public Krugimpl(double radius) {

        this.radius = radius;
    }


    public double area() {

        return Math.PI * Math.pow(radius,2);
    }


    public double perimiter() {

        return 0;
    }


    public String info() {

        return null;
    }
}
