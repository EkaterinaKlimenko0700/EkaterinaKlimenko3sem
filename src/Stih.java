public class Stih<stih> {
    String[] stihi;//поле с массивом
    int length;

    Stih(String[] mass) {   //создаем конструктор
        this.stihi = mass;
        this.length = mass.length;
    }

    private void Punkt(){//пунктуация
        for (int i = 0; i < length; i++) {
            stihi[i] = stihi[i].replaceAll("[^a-zA-Zа-яА-Я\\s]","");
            System.out.println(stihi[i]);
            }
        System.out.println("\n");
    }

    public void Poisk3() {//поиск по трём последним буквам

            Punkt();
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length && j!=i ; j++) {
                    String a, b;
                    if (stihi[i].length() < 3)//длина <3
                        a = stihi[i];//оставляем
                    else a = stihi[i].substring(stihi[i].length() - 3);//отделяем последние 3 символа

                    if (stihi[j].length() < 3)//длина <3
                        b = stihi[j];//оставляем
                    else b = stihi[j].substring(stihi[j].length() - 3);//отделяем последние 3 символа

                    if (a.equals(b))//сравниваем строчки получившиеся
                        System.out.println("Строка " + (j + 1) + " рифмуется со строкой " + (i + 1));
                }}
        }

    public void Poisk2() {  //поиск по двум последним буквам

        Punkt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length && i != j; j++) {
                String a, b;//оставляем
                if (stihi[i].length() < 2)
                    a = stihi[i];
                else a = stihi[i].substring(stihi[i].length() - 2); //отделяем последние 2 символа

                if (stihi[j].length() < 2)
                    b = stihi[j];
                else b = stihi[j].substring(stihi[j].length() - 2);

                if (a.equals(b))//сравниваем
                    System.out.println("Строка " + (j + 1) + " рифмуется со строкой " + (i + 1));
            }
        }
    }
}

