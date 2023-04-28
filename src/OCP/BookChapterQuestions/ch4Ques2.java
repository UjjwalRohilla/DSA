package OCP.BookChapterQuestions;

public class ch4Ques2 {
    public static void main(String[] args) {
        int temp = 4;
        long humidity = -temp + temp*3;
        if(temp>=4)
            if (humidity<6) System.out.println("Too low");
        else System.out.println("just right");
        else System.out.println("Too high");
    }
}
