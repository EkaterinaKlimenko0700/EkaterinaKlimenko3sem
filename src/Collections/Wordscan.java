package Collections;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Set;

public class Wordscan {

        private Set<String> text;
        private InputStream stream;

        public Wordscan(Set<String> text, InputStream stream) {
            this.text = text;
            this.stream = stream;
        }
        public void read()
        {
            Scanner scanner = new Scanner(stream);
            scanner.useDelimiter("\\s|;|\\.|,|:|!|\\?|—");
            while (scanner.hasNext()){
                String str = scanner.next();
                str = str.toLowerCase();
                text.add(str);
            }
        }
    }
