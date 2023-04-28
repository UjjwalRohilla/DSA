package LearningThings;

public class LearningStatic {
    public static int num = 2;
    public static void main(String[] args){
        //LearningStatic nonstatic = new LearningStatic();
        //nonstatic.nonStatic();
          //nonStatic();
        LearningStatic.num=4;
        System.out.println(num);
        LearningStatic k = new LearningStatic();
        LearningStatic k2 = new LearningStatic();
        k.num = 5;
        System.out.println(num);
        k2.num = 6;
        System.out.println(LearningStatic.num);
        k.nonStatic(256);
        k.nonStatic(565);
        System.out.println(num);
    }
    public void nonStatic(int a){
        LearningStatic k = new LearningStatic();

        System.out.println(k.num);
        k = null;
        System.out.println(k.num);
        num = a;
        System.out.println(num);
    }
}
