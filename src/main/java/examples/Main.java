package examples;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human anna = new Human(
                "Anna",
                22,
                true
        );

//        anna.setName("Anna");
//        anna.setAge(22);
//        anna.setCute(true);

//        anna = new Human(
//               "Anna",
//               23,
//               true
//        );
//        System.out.println(anna);
//        anna = anna.incrementAge();
//        System.out.println(anna);
//        anna.sayHelloNonStatic();
//        Human.sayHello(); //статический метод не привязан ник  какому оъекту нашего класса, не может ничего знать о состоянии объекта. то просто функция с каким-то кодом
//

//      List<String> cats = List.of("Felix", "Kuzya", "Alisa"); если записать так, то лист будет immutable, его нельзя поменять, он создался как строка
        //изменение такого списка:
//      new ArrayList<>(cats).add()

        List<String> cats = new ArrayList<>();
        cats.add("Felix");
        cats.add("Kuzya");
        cats.add("Alisa");
        int varInt = 13;
        String hello = "Hello";

        anna.printSomeValues(
                varInt,
                hello,
                cats
        );
        //данные могут передаваться по значению и по ссылке. По значению- создается копия этих данных, метод работает с копией.
        // По ссылке- в момент передави даетсмя адрес данных, которе лежат где-то в памяти. И метод оперирует не с копией, а с адресом в памяти, где эти данные лежат.
        // Передача по адресу опаснее, с данными может что-то случится. НО быстрее. В джаве все всегда передается по значению!!!!
        // НО в случае примитвыных типов - копируем само значение, в случае ссылочных - копируем ссылку на место в памяти
        // в java всегда все передается по значению, но в случае с ссылочным типом данных - этим значением явялется сама ссылка на место в памяти

        System.out.println("After method, int: " + varInt); //метод никак не поменял этот int
        System.out.println("After method, String: " + hello); //метод никак не поменял этот String
        System.out.println("After method, List: " + cats); //В метод передалась копия ссылки, нор по этой ссылку метод добавил объект.если мы передаем в метод не immutable объект, то метод может его поменять.
        // Если примитивный или immutable тип, то его нельзя поменять. Human - immutable, потому что все значения final

        // массивы. массив - специальный тип объекта в java
        String[] catsArray = new String[3];
        catsArray[0] = "Felix";
        catsArray[1] = "Kuzya";
        catsArray[2] = "Alisa";
        String[] catsArrayNew = new String[] {
                "Felix",
                "Kuzya",
                "Alisa"
        };

//        catsArray.length
        //у массива всегда определенная длина, кторую нельзя менять, поэтомсу чаще используют list

        int[] intArray0 = new int[] {1, 2, 3};
        int[] intArray1 = new int[] {1, 2, 3};

        //массивы могут быть двумернымиб трехмерными итд
        //двумерный массив - то массив массивов

        int[][] twoDimArray0 = new int[][] {
                intArray0,
                intArray1
        };
        int[][] twoDimArray1 = new int[][] {
                intArray0,
                intArray1
        };


        int[][][] threeDimArray = new int[][][] {
                twoDimArray0,
                twoDimArray1
        };

//        //циклы
//        //1
//        for (int i =0; i < catsArray.length; i++) {
//            System.out.println(catsArray[i]);
//        }
//
//        for (int i =catsArray.length - 1; i >= 0 ; i--) {
//            System.out.println(catsArray[i]);
//        }
//        //2 слева указывается тип элемента массива
//        for ( String catName : catsArray ) {
//            System.out.println(catName);
//        }
//        //3
//        int i = 0;
//        while (i < catsArray.length) {
//            System.out.println(catsArray[i]);
//            i++;
//        }
//        //4
//        do {
//            System.out.println(catsArray[i]);
//            i++;
//        } while (i < catsArray.length); //когда нужно, чтобы хотя бы одна первая итерация прошла

        //
        for (String catName : catsArray) {
            if (catName.startsWith("F")) {
                System.out.println(catName);

            }
        }
        //выход из цикла. Представим, что нужно найти только первое значение
        for (String catName : catsArray) {
            if (catName.startsWith("F")) {
                System.out.println(catName);
                break;

            }
        }
        //если значение не подходящее, то эту итерацию прерываем и уходим на следующую - continue
        for (String catName : catsArray) {
            if (!catName.startsWith("F")) {
                continue;
            }
            System.out.println(catName);
//            break;
//            return;
        }
        //return - выход из метода. Если выйти из метода, в котором выполнялся цикл, то естественно цикл тоже завершится

        //Set множество уникальных объектов
        Set<String> catsSet = new HashSet();
        Set<String> catsSet2 = Set.of("Felix", "Kuzya");
        //Set не позволяет хранить одинаковые элементы
        //прочитать про equals, hashcode и зачем их переопределять


        //Map - хранение данных по принципу ключ-значение (маленький аналог БД внутри кода). Ключи уникальные. HashSet - это половинка HashMap
        Map<String, Human> humans = new HashMap<>();
        humans.put("3479234789", anna);
        humans.put("1244354545", anna);
        humans.put("7875321111", anna);

        //Итерация по Map
        //humans.entrySet() //возвращает набор пар значений

        for (Map.Entry<String, Human> entry : humans.entrySet()) {
            entry.getKey(); //паспорт
            entry.getValue(); //человек
        }

        //humans.keySet позволяет проитерироваться просто по ключам

        for (String keys : humans.keySet()) {

        }
        //по значению
        for (Human value : humans.values()) {

        }


    }
}
