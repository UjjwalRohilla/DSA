package JavaCourse.Questions.Arrays.Arrays;

import java.util.Scanner;

public class BinarySearchAlgorithmMySol {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target value = ");
        int target = in.nextInt();
        int start=0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int arrCount= end+1;
         while(target!=arr[mid]){
             if(target>arr[mid]){
                 start = mid+1;
                 mid = (start+end)/2;
             }
             else if (target<arr[mid]) {
                 end= mid--;
                 mid = (start+end)/2;
             }
         }
         System.out.println("The answer is "+ mid);
    }
}
