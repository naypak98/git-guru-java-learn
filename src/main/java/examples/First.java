package examples;

import java.util.List;

public class First {
    public static void main(String... args) {
 //void - метод ничего не возвращает
// () - аргументы метода

        //ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ
        byte aByte = 0; // 8бит -128 +27
        short aShort = 0; // 16бит  -32768 +32767
        int aInt =0; // 32бит (-2^32)..(+2^32 -1) 14млрд...
        long aLong= 0; // 64бит очень много

        // 0 -числовой литерал типа int, 0L - числовой литерал типа long, нельзя создать лиетрал типа short и byte

        //типы с плавающей точкой:
        float aFloat = 0.0F; //32бита
        double aDouble = 0.0; //64бита

        //символьный тип
        char aChar = 'a';

        //логический тип
        boolean aBoolean = true;

        //ОБЪЕКТЬНЫЕ (ССЫЛОЧНЫЕ) ТИПЫ ДАННЫХ
        //строка (и бесконечность других объектных типов)

        String toBePrint = "Hello, World!";
        List<String> koshki = List.of("Felix", "Kuzya", "Alisa");

        // Классы созданны чтобы описывать новые типы данных и String это тоже класс

//ОПЕРАТОРЫ
        //оператор присвоения =
        String nameFirst = "Felix";
        String nameSecond = "Felix";
        int age = 8;
        //Арифметические операторы + - . * % ++ --
        System.out.println(5 / 3); // =1
        //деление в джаве отбрасывает остаток если используются целые числа
        System.out.println(5 % 3); // =2 остаток от деления
        // ++ инкримент и декримент -- это сокращенная запись прибавления единицы
        int result = ++aInt; //или aInt++
        //Операторы сравнения <, >, >=, <=, !=, ==
        System.out.println(3 > 2);
        //сравнение стрингов и других объектов
        System.out.println(nameFirst.equals(nameSecond));
        //логические операторы & и, | или , && короткое и, || короткое или, ! инвертирует
        System.out.println(nameFirst.equals("Felix") && age == 8);
        System.out.println(!(nameFirst.equals("Felix")));
        // одинарный & проверяет все условия до конца (вычисляет все аргументы), а двойной && пока не будет false из-за того могут быть ошибки, лучще использовать двойные

        // оператор instanceof
        System.out.println(nameFirst instanceof String); //является ли та переменная типом стринг

        // тернарный оператор позволяет что-то проверить прежде чем сделать

        char sex = 'm';

        String childName = sex == 'm'? "Valentin" : "Valentina";

        //управляющая конструкция if
        if (sex == 'm') {
            childName = "Valentin";
        } else {
            childName = "Valentina";
        }
        //если не надо возвращать какой-то результат исопльзуем if

        //ключевое слово new используетсмя для создания новых объектов, но для Sring это не обязательно
        String name2 = new String("name2");
        String name3 = "name2";

        // List<String> koshki = List.of("Felix", "Kuzya", "Alisa")
        // а здесь используется вызов статического метода, в котром есть new

        //В джава примитимные типы данных это не объекты. Но есть способ сделать их объектами - это обертки
        Boolean booleanWrapper = true;
        Character charWrapper = 'a';
        Integer intWrapper = 0;
        //используется чтобы вообще не использовать никакие примитивные типы данных. Примеры 1)связано со значением по умолчанию(посмотреть статью), 2) Во многих местах нельзя использовать примитивы, например List<Integer>
        // присвоение значения = называется боксинг и анбоксинг, упаковка примитива в эту обертку и распаковка








        System.out.println(toBePrint);
    }
}

//