package examples;

import java.util.List;

public class Human {
    private static String staticName = "Human";
    private final String name;
    private final int age;
    private final boolean isCute;


    // alt + ins
    //переопределяем метод toString
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }

    //гетеры сетеры

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public boolean isCute() {
        return isCute;
    }

//    public void setCute(boolean cute) {
//        isCute = cute;
//    }

    //конструктор
    //конструктор всегда повторяет название класса
    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    public Human incrementAge() {
        return new Human(
                this.name,
                (this.age + 1),
                this.isCute
        );
    };

//    static void sayHello() {
//        System.out.println("Hello, " + this.name); //static не может ничего знать о состоянии объекта
//    }
    static void sayHello() {
        System.out.println("Hello, " + staticName);
    }
    void sayHelloNonStatic() {
        System.out.println("Hello, " + this.name);
    }
    void printSomeValues(int i, String str, List<String> list) {
        i = 100;
        list.add("Margo");
        System.out.println("int: " + i + ", "
                + "string: " + str.toUpperCase() + ", "
                + "list: " + list);

    }



    

}
