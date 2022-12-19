package JavaCourse.Questions.Arrays.Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of space in array");
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= in.nextInt();
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]= 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for (; j < nums.length ; j++) {
            nums[j]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
