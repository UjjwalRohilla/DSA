package JavaCourse.Loops;

import java.util.Scanner;

public class LoopsQuestion5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int s = 1;
        while(i>1){
            System.out.println(s*=i);
            i--;
        }
    }
}
