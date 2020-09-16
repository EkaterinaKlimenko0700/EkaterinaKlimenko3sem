package Nasledovanie;

public interface Kvadrat extends Figure{
    static Kvadrat create(int a){

        return new Kvadratimpl(a);
    }
}