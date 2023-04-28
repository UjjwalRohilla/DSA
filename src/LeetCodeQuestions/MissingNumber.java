package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,4,2,5,7,0,1};
        Arrays.sort(arr);
        missingNumber(arr);

    }
    static void missingNumber(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>(3);
        for (int i = 0; i < nums[nums.length-1]; i++) {
            int miss = binarySearch(nums,i);
            if(miss!=-1){
                ans.add(miss);
            }
        }
        for (int a :ans) {
            System.out.println(a);
        }
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return -1;
            }else if (arr[mid]>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return target;
    }
}
