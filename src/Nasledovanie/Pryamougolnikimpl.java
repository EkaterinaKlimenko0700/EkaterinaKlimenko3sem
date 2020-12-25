package Nasledovanie;

public class Pryamougolnikimpl extends Parallelogramabstract implements Pryamougolnik{



    public double area() {

        return heigh * width;
    }


    public String info() {

        return "Прямоугольник с высотой " + heigh + " и шириной " + width;
    }

    public Pryamougolnikimpl(double heigh, double width) {

        super(heigh, width);
    }
}
