package OCP.BookChapterQuestions;

public class Koala {
    public static int count = 3;
    public static void main(String[] args){
        System.out.println(count);
        System.out.println(count+1);
        System.out.println(count+35);
        Koala obj = new Koala();
        obj.nonStatic();
        Static();
    }
    public void nonStatic(){
        int a = count;
        System.out.println("non Static "+a);
        Static();
    }
    public static void Static(){
        int b = count;
        System.out.println("Static "+b);
    }
}
