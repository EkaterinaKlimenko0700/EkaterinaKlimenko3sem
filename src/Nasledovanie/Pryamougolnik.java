package Nasledovanie;

public interface Pryamougolnik extends Figure {
    static Pryamougolnik create(double heigh, double width) {

        return new Pryamougolnikimpl(heigh, width);
    }
}