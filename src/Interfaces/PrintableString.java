package Interfaces;

public class PrintableString implements Printable {

    String str;

    public PrintableString(String str)
    {
        this.str = str;
    }

    public void print() {

        System.out.println(str);
    }
}