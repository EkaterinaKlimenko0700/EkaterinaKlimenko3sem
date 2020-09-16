package Nasledovanie;

public abstract class Parallelogramabstract implements Parallelogram {
    double heigh;
    double width;

    public Parallelogramabstract(double heigh, double width)
    {
        this.heigh = heigh;
        this.width = width;
    }

    public double perimiter() {

        return (heigh + width) * 2;
    }

}