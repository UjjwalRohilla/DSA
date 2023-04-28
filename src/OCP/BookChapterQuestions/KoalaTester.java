package OCP.BookChapterQuestions;

public class KoalaTester {
    public static void main(String[] args){
        //Koala.main(new String[35]);
        //System.out.println(Koala.count);
        Koala k = new Koala();
        System.out.println(k.count);
        k = null;
        System.out.println(k.count);
    }
}
