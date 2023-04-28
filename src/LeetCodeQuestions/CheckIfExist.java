package LeetCodeQuestions;

import java.util.Arrays;

public class CheckIfExist {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));

    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            int found = binarySearch(arr,arr[i]*2);
            if(found!=-1&&found!=i){
                return true;
            }
        }
        return false;
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }else if (arr[mid]>target){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
