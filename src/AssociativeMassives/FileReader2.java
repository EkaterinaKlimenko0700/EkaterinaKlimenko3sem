package AssociativeMassives;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class FileReader2 {


        private Map<String, Integer> mapWords;

        public void FileReader(Map<String, Integer> mapWords)
        {

            this.mapWords = mapWords;
        }

        public void readFile(String filePath) throws FileNotFoundException
        {
            File text = new File(filePath);
            Scanner scaner = new Scanner(text);
            scaner.useDelimiter("\\s|;|\\.|,|:|!|\\?|—");
            while(scaner.hasNext())
            {
                String word = scaner.next();
                String lowerCase = word.toLowerCase();
                if(lowerCase.length()!=0)
                {
                    int count = mapWords.getOrDefault(lowerCase, 0);
                    mapWords.put(lowerCase,count+1);
                }
            }
            scaner.close();
        }

        public List<Map.Entry<String, Integer>> getSorted()
        {
            return mapWords.entrySet().stream().sorted(new Comparator<Map.Entry<String, Integer>>() {

                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if(o1.getValue() > o2.getValue())
                        return -1;
                    else if (o1.getValue() < o2.getValue())
                        return 1;
                    return 0;
                }
            }).collect(Collectors.toList());
        }

        public FileReader2(Map<String, Integer> mapWords) {

            this.mapWords = mapWords;
        }
    }

