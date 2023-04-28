package LearningThings;

public class ins {
    public static int num = 2;
    public static void main(String[] args){
        ins obj = new ins();
        ins obj2 = new ins();
        ins obj3 = new ins();
        obj.num=3;
        obj2.num=4;
        obj3.num= 5;
        obj2.num = 44;

        System.out.println(obj.num);
        System.out.println(obj2.num);
        System.out.println(obj3.num);
        nonStatic();
        obj3.num=98;
        System.out.println(obj3.num);
      //  obj.num = 5656;
        System.out.println(obj.num);
        System.out.println(obj3.num);
    }
    public static void nonStatic(){
        ins nonS = new ins();
        nonS.num = 56;
        System.out.println(nonS.num);
    }
}
