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

        public double area() {
            double p =perimiter()/2;
            return Math.sqrt(p * (p -a) *(p-b) * (p-c));
        }


        public double perimiter() {

            return a + b + c;
        }


        public String info() {

            return null;
        }


        public double capacity() {

            return 0;
        }
    }


