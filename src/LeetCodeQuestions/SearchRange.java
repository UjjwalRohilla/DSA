package LeetCodeQuestions;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));

    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = binarySearch(nums,target,true);
        if(ans[0]!=-1){
            ans[1]= binarySearch(nums,target,false);
        }
        return new int[] {ans[0],ans[1]};
    }
    static int binarySearch(int[] arr,int target,boolean isTrue){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                if(isTrue){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else if(arr[mid]>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
}
