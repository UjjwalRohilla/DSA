package LeetCodeQuestions;

import java.util.Arrays;

public class MinimumInRotated {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int pivot = searchPivot(nums);
        if(pivot==-1){
            return nums[0];
        }
        return pivot+1;
    }
    static int searchPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }

        }
        return -1;
    }
}
