package Nasledovanie;

public interface Romb extends Figure {

    static Romb create(double d1, double d2) {

        return new Rombimpl(d1, d2);
    }

}
