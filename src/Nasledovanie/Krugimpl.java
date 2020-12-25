package Nasledovanie;

public class Krugimpl implements Circle {

    double radius;

    public Krugimpl(double radius) {

        this.radius = radius;
    }


    public double area() {

        return Math.PI * Math.pow(radius,2);//площадь круга
    }


    public double perimiter() {

        return 2*Math.PI*radius;//периметр круга
    }


    public String info() {

        return "Круг с радиусом " + radius;
    }
}
