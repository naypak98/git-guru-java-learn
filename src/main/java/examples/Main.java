package examples;

import java.util.ArrayList;
import java.util.List;

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

        // 1:09 про массивы

    }
}
