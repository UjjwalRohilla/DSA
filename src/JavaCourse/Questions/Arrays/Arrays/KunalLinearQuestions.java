package JavaCourse.Questions.Arrays.Arrays;

import java.util.Scanner;

public class KunalLinearQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ={18,12,9,14,77,50};
        System.out.print("Enter a number you want to search in this array = ");
        int find=in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==find){
                System.out.println("yes "+ find +" number exist in this array");
            }
        }
    }
}
