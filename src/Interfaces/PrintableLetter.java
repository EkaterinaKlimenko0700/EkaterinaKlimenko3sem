package Interfaces;

public class PrintableLetter implements Printable {
    int count;
    String letter;

    public PrintableLetter( String letter, int count) {
        this.count = count;
        this.letter = letter;
    }

    public void print() {
        for(int i = 0; i < count; i++)
            System.out.print(letter);
        System.out.println();
    }
}