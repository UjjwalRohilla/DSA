package OCP.BookChapterQuestions;

public class ch4Ques14 {
    public static void main(String[] args) {
        int snake = 0;
        double iguana = 0;
        do {
            snake = 1;
            System.out.println(snake++ + " ");
            iguana--;
        }while (snake <= 5);
        System.out.println(iguana);
    }
}
// infite loop
// but this question back ans saying 1,2,3,4,5,-5,0
