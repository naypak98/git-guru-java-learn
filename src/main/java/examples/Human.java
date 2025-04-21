package examples;

public class Human {
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



    

}
