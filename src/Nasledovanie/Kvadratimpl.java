package Nasledovanie;

public class Kvadratimpl extends Pryamougolnikimpl implements Kvadrat, Romb {

    public double capacity() {

        return 0;
    }

    public Kvadratimpl(double a) {

        super(a,a);
    }
}

