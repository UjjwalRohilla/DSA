package JavaCourse.Loops;

import java.util.Scanner;

public class LoopsQuestion4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int s = 1;
        for(int i = 0;i<b;i++){
            System.out.println(s*=a);
        }
    }
}
