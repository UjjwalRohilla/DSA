package JavaCourse.Arrays;

import java.util.Scanner;

public class roughClassForArraysPractice {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 17;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
}
