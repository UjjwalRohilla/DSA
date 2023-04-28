package LearningThings;

public class Student {
    final int age;
    final String name;
    final int birthYear;
    final float percentage;
    public Student(int age,String name,int birthYear,float percentage){
        this.age = age;
        this.name = name;
        this.birthYear = birthYear;
        this.percentage = percentage;
    }
//    public Student(int age,String name,int birthYear){
//        this(15,"kartik",2001,78.5f);
//        this.age = age;
//        this.name = name;
//        this.birthYear= birthYear;
//    }
    public static void main(String[] args) {
        Student s1 = new Student(15,"kartik",2001,78.5f);
        System.out.println(s1.name+" "+ s1.age+" "+ s1.birthYear+" "+ s1.percentage);
    }
}
