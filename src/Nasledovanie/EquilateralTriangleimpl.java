package Nasledovanie;

public class EquilateralTriangleimpl extends Triangleimpl {

    public EquilateralTriangleimpl(double a, double b) {

        super(a, b, Math.sqrt(a * a + b * b));
    }
}