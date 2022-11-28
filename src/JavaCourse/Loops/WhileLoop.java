package JavaCourse.Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;
        int by= 1;
        while(by<=10){
            b = a*by;
            System.out.println(a+"x"+by+"="+b);
            by++;
        }
    }
}
