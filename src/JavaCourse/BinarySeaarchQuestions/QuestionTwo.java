package JavaCourse.BinarySeaarchQuestions;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        int target = in.nextInt();
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]<target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return arr[end];
    }
}
