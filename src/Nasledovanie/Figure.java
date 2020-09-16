package Nasledovanie;

public interface Figure {
    double area();//метод 1 - возвращает площадь
    double perimiter();//метод 2 - возвращает периметр
    String info();// метод 3 - для указания краткой информации о фигуре

    static double capacity(Figure f){

        return f.area()/Math.pow(f.perimiter(), 2);//для вычисления ёмкости

    }
    default double capacity()
    {

        return Figure.capacity(this);
    }
}
