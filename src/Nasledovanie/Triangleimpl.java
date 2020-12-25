package Nasledovanie;

    public class Triangleimpl implements Triangle{
        double a;
        double b;
        double c;

        public Triangleimpl(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

       public double perimiter() {

            return a + b + c;
        }

        public double area() {
            double p = perimiter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }



        public String info() {

            return "Треугольник со сторонами " + a + ", " + b + " и " + c;
        }


        public double capacity() {

            return 0;
        }
    }


