package JavaCourse.Functions;

public class functionRough {
    public static void main(String[] args) {
      String personalised = mygreet(20);
        System.out.println(personalised);

    }
    static String mygreet(int yolo){
        String greeting = "Hello "+ yolo;
        return greeting;
    }
}
