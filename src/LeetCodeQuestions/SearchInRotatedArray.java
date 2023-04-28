package LeetCodeQuestions;

import java.util.Scanner;

public class SearchInRotatedArray {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
//        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {1,3};
        int[] arr = {3,5,1};


//        int[] arr = {5,6,7,0,1,2,3,4};
//        int[] arr = {6,7,0,1,2,3,4,5};
        int pivot = searchPivot(arr);
        System.out.println("Pivot index "+pivot);
        int ans = search(arr,target);
        System.out.print("Target index "+ans);

    }
    public static int search(int[] nums, int target) {
        int ans = -1;
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }else {
                return -1;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            ans = binarySearch(nums,target,0,nums.length-1);
            return ans;
        }
        int pivot = searchPivot(nums);
        if(nums[pivot]==target) return pivot;
        if(nums[0]<=target){
            ans = binarySearch(nums,target,0,pivot-1);
        }else {
            ans = binarySearch(nums,target,pivot+1,nums.length-1);
        }
        return ans;

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
    static int binarySearch(int[] arr, int target,int start,int end){
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
        return -1;
    }
}
