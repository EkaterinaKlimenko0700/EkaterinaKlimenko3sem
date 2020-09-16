package AssociativeMassives;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class AssociativeMassives {

    public static void main(String[] args) throws FileNotFoundException {

        var res = positionCharacter("banana");

        for(var y : res.entrySet())// entrySet  возвращает набор элементов коллекции
        {
            System.out.println("'" + y.getKey() + "'" + " -> "+y.getValue());
        }

        System.out.println("--------Задача 3--------");

        var res2 = countCharacter("banana");
        for(var i : res2.entrySet())
        {
            System.out.println("'" + i.getKey()+ "'" +  " -> "+i.getValue());
        }

        System.out.println("--------Задача 4--------");

        FileReader2 counter = new FileReader2(new HashMap<>());
        counter.readFile("propaganda.txt");
        for (var item : counter.getSorted()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }

    public static Map<Character, Integer> countCharacter(String s)
    {
        Map<Character, Integer> mapCounter = new TreeMap<>();
        char[] arr = s.toLowerCase().toCharArray(); // в нижний регистр и создаем из строки массив чаров
        for(Character ch : arr)
        {
            int i = mapCounter.getOrDefault(ch,0);
            mapCounter.put(ch,i+1);
        }
        return mapCounter;
    }


    public static Map<Character, List<Integer>> positionCharacter(String s)
    {
        Map<Character, List<Integer>> mapCounter = new TreeMap<>();
        char[] arr = s.toLowerCase().toCharArray(); // в нижний регистр и создаем из строки массив чаров
        for(int i=0; i<arr.length; i++)
        {
            Character ch = arr[i];
            var list = mapCounter.getOrDefault(ch,new ArrayList<Integer>());
            list.add(i);
            if(list.size()==1)
                mapCounter.put(ch,list);
        }
        return mapCounter;
    }


    public Map<String, Integer> mapWords;


    public void FileReader(Map<String, Integer> mapWords)

    {

        this.mapWords = mapWords; // создаем конструктор
    }


    public void readFile(String PathToFile) throws FileNotFoundException
    {
        File text = new File(PathToFile);
        Scanner scaner = new Scanner(text);
        scaner.useDelimiter("\\s|;|\\.|,|:|!|\\?|—");


        while(scaner.hasNext())
        {
            String word = scaner.next();
            String wordTolowerCase = word.toLowerCase();
            if(wordTolowerCase.length()!=0)
            {
                int count = mapWords.getOrDefault(wordTolowerCase, 0);//дефолтное значение
                mapWords.put(wordTolowerCase,count+1);
            }
        }
        scaner.close();
    }




}




