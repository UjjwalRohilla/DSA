package JavaCourse.Arrays;

import java.util.Scanner;

public class TwodArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of row you want");
        int a = in.nextInt();
        int b = 1;
        int b2;
        int[][] arr = new int[a][b];
        for (int row = 0; row < arr.length; row++) {
            System.out.println("Enter a number of column you want in  "+row);
            b2 = 3;
            b = b2;
            for (int col = 0; col < b2; col++) {
                System.out.println("Hello");
            }
            System.out.println(arr[row]);
        }

    }
}
