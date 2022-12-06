package JavaCourse.Arrays;

import java.util.Scanner;

public class roughClassForArraysPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= in.nextInt();
            }
        } /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }*/
        System.out.println(arr[1][0]);

    }
}
