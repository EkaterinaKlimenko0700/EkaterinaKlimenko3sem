package Interfaces;

public class Main {

    public static void main(String[] args) {

        Printable p = new PrintableLetter("x",10);

        Printable s = new PrintableString("Covid_uhodi");

        Printable draw = new Drawing(10,10,'X');

        Printable[] mass = new Printable[5];


        mass[0] = draw; //Drawing

        mass[1] = p;//PrintableLetter

        mass[2] = s;//PrintableString

        mass[3] = new Printable() {

            public void print() {
                System.out.println("Hello. I'm Kate");
            }
        };

        mass[4] = ()->System.out.println("lambda");

        for(Printable pr: mass)
            pr.print();}

}



