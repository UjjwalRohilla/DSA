package JavaCourse.Questions.Arrays.Arrays;

import java.util.Scanner;

public class BinarySearchAlgorithmKunalPlusMySol {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target value = ");
        int target = in.nextInt();
        int start=0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int arrCount= end+1;
        while(start<=end){
            mid = (start+end)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]) {
                end= mid-1;
            }
            else{
                System.out.println(mid);
                break;
            }
        }
        if(target!=arr[mid]){
            System.out.println("Not Found");
        }
    }
}
