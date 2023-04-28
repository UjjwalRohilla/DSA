package LeetCodeQuestions;

import LearningThings.Person;

public class DuplicateRotated {
    public static void main(String[] args){
        int[] arr = {2,2,5,6,0,0,1,2,2,2};
        int pivot = pivotInDuplicate(arr);
        int target = 0;
        boolean isPresent= search(arr,target);
        System.out.println(isPresent);
    }
    public static boolean search(int[] nums, int target) {
        int pivot = pivotInDuplicate(nums);
        int ans = -1;
        if(pivot==-1){
            ans = binarySearch(nums,target,0,nums.length-1);
        }
        if (nums[pivot]==target){
            return true;
        }
        if(nums[0]<target){
            ans = binarySearch(nums,target,0,pivot-1);
        }else {
            ans = binarySearch(nums,target,pivot+1,nums.length-1);
        }
        return ans==target;
    }
    static int pivotInDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        if(start==end){
            while(start==end){
                start++;
                end--;
            }
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr , int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
