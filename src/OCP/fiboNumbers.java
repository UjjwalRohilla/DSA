package OCP;

import java.util.Scanner;

public class fiboNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 0;
        int target = in.nextInt();
        for (int i = 2; i <= target; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        System.out.print(c);
    }
}
