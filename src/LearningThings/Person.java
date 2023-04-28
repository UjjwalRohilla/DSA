package LearningThings;

public class Person {
    final int age;
    final String name;
    final int birthYear;
    float marks;

    public Person(int age, String name, int birthYear, float marks) {
        this.age = age;
        this.name = name;
        this.birthYear = birthYear;
        this.marks = marks;
    }

    public Person() {
        this(24, "Natasha", 1998,45.0f);
    }

    public Person(float marks) {
        this();
        this.marks = 98.5f;
    }

    public static void main(String[] args) {
        Person p1 = new Person(21, "Ujjwal", 2001,45.0f);
        Person p2 = new Person();
        System.out.println(p1.age + " " + p1.name + " " + p1.birthYear);
        System.out.println(p2.age + " " + p2.name + " " + p2.birthYear);

    }
}
