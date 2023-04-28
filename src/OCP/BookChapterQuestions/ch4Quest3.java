package OCP.BookChapterQuestions;

public class ch4Quest3 {
    public static void main(String[] args) {
        int[] val = {10,14};
        for(var a : val){
            System.out.print(a+", ");
        }
        for(int b : val){
            //continue; // <----- error
            System.out.print(b+ ", ");
        }
        for(Object c : val){
            System.out.print(c+", ");
        }
    }
}
