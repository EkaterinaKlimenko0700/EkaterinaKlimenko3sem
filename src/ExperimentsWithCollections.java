import java.util.ArrayList;
import java.util.List;

public class ExperimentsWithCollections {
    public static void main(String[] args) {
        List<Integer> sto = Collections.makingList();
        System.out.println(sto);

        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        a.add("ww");
        b.add("ru");
        System.out.println(Collections.mergeList(a, b));}
}

