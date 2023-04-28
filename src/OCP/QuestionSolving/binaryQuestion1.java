package OCP.QuestionSolving;

import java.util.Scanner;

public class binaryQuestion1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,5,6,8,9,11,15,17,19,20,25};
        int target = in.nextInt();
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start;

    }
}
