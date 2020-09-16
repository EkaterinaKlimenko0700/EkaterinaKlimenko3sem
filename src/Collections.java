import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static List<Integer> makingList(){

        List<Integer> listint = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listint.add(i+1);
        }
        return  listint;
    }


    public static List<String> mergeList(List<String> a, List<String> b) {

        List<String> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

}