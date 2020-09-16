package Nasledovanie;

public interface Circle extends Figure{
    static Circle create(double r){

        return new Krugimpl(r);
    }
}