package Collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Collections {


        public static void main(String[] args) throws IOException {
            List<Integer> list100 = create100();
            System.out.println("list100 = " + list100); // [1, 2, 3, ..., 100]

            List<String> list1 = List.of("abc", "xyz", "ooo");

            // на экране появится
            //   Элементов в списке: 3
            //   abc
            //   xyz
            //   ooo
            printList(list1);

            List<String> list2 = List.of("abc", "xyz", "ooo");

            // на экране появится
            //   Элементов в списке: 3
            //   1: abc
            //   2: xyz
            //   3: ooo
            printListWithIndices(list1);

            List<String> list3 = List.of("aaa", "bbb", "ccc");
            List<String> list4 = List.of("xxx", "yyy", "zzz");
            List<String> list3plusList4 = concatenateLists(list3, list4);
            System.out.println(list3plusList4); //aaa bbb ccc xxx yyy zzz
            // можно не проверять, что исходные списки не изменились, потому что List.of()
            // создает неизменяемый список. Но можно и проверить:
            System.out.println(list3); //aaa bbb ccc
            System.out.println(list4); //xxx yyy zzz

            //созадем изменяемый список list5.
            List<String> list5 = new ArrayList<>(List.of("first", "middle", "last"));
            //сначала чистая функция
            List<String> list5rev = reverseList(list5);
            //проверяем, что list5rev перевернутый, а list5 остался без изменений.
            System.out.println("list5rev = " + list5rev + ", but list5 = " + list5);

            //теперь функция, которая меняет сам список
            reverseListInPlace(list5);
            //проверяем, что список действительно изменился
            System.out.println("list5 = " + list5);

            List<String> ints = List.of("11", "22", "33", "55", "66", "88", "100", "3", "4");

            System.out.println("ints = " + ints);
            //функция должна удалить элементы с четными индексами, т.е. оставить только каждое второе число
            System.out.println("ints no even indices = " + filterEvenIndices(ints)); //["22", "55", "88", "3"]
            //функция должна удалить четные числа

            //теперь удалим четные числа, но в списке уже из Integer:
            List<Integer> ints2 = List.of(11, 22, 33, 55, 66, 88, 100, 3, 4);
            System.out.println("ints without even = " + filterEven2(ints2)); //[11, 33, 55, 3]


            System.out.println(" ============= mutable lists =================== ");

            List<String> mutableInts = new ArrayList<>(ints);
            mutableFilterEvenIndices(mutableInts);
            System.out.println("ints no even indices = " + mutableInts); //["22", "55", "88", "3"]


            List<Integer> mutableInts2 = new ArrayList<>(ints2);
            mutableFilterEven2(mutableInts2);
            System.out.println("ints without even = " + mutableInts2); //[11, 33, 55, 3]

            Set<String> hashSet = new HashSet<>();
            Set<String> linkedHashSet = new LinkedHashSet<>();
            Set<String> treeSet = new TreeSet<>();

            doReadWordsInFile("a.txt", hashSet);
            doReadWordsInFile("a.txt", linkedHashSet);
            doReadWordsInFile("a.txt", treeSet);
        }
        public static void doReadWordsInFile(String fileName, Set<String> set) throws IOException {
            try (InputStream stream = new FileInputStream(new File(fileName)))
            {
                Wordscan counter = new Wordscan(set, stream);
                counter.read();
            }
            System.out.println(set);
        }

        public static List<Integer> create100() {
            List<Integer> listint = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                listint.add(i + 1);
            }
            return listint;
        }

        public static void printList(List<String> list1) {
            for (String i : list1)
                System.out.println(i);
        }


        public static void printListWithIndices(List<String> list2) {

            for (int i = 0; i < list2.size(); i++) {

                System.out.println((i + 1) + "->" + list2.get(i));
            }


        }

        public static List<String> concatenateLists(List<String> list3, List<String> list4) {

            List<String> c = new ArrayList<>();
            c.addAll(list3);
            c.addAll(list4);
            return c;

        }

        public static List<String> reverseList(List<String> list5) {//чистый метод
            List<String> x = new ArrayList<>();
            for (int i = list5.size() - 1; i >= 0; i--) {
                x.add(list5.get(i));
            }
            return x;
        }

        public static void reverseListInPlace(List<String> list5) {
            for (int i = list5.size() - 1; i >= 0; i--) {
                int IndexPair = list5.size() - i - 1;
                var vol1 = list5.get(i);
                var vol2 = list5.get(IndexPair);
                list5.set(i, vol2);
                list5.set(IndexPair, vol1);
            }

        }

        public static List<String> filterEvenIndices(List<String> list6) {
            List<String> x = new ArrayList<>();
            for (int i = 0; i < list6.size(); i++) {
                if (i % 2 == 1)
                    x.add(list6.get(i));
            }
            return x;
        }

        public static void mutableFilterEvenIndices(List<String> list6_1){  /*["22", "55", "88", "3"]*/
            for (int i = list6_1.size() - 1; i >= 0; i--) {
                String even = list6_1.get(i);
                if (i % 2 == 0)
                    list6_1.remove(even);
            }
        }



        public static List<Integer> filterEven2(List<Integer> list8) {
            List<Integer> z = new ArrayList<>();
            for (int num : list8) {
                if (num % 2 != 0)
                    z.add(num);
            }
            return z;
        }

        public static void mutableFilterEven2(List<Integer> list8_1) {   /*[11, 33, 55, 3]*/
            for (int i = list8_1.size() - 1; i >= 0; i--) {
                int num = list8_1.get(i);
                if (num % 2 == 0)
                    list8_1.remove(i);
            }
        }

    }

