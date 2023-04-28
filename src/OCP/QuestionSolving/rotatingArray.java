package OCP.QuestionSolving;

import java.util.Scanner;

public class rotatingArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {6,7,8,8,8,8,8,8,1,2,3,4,5};
        int target = in.nextInt();
        int pivot = findingPivot(arr);
        int ans = findingInRotatingArray(arr,target);
        System.out.println("pivot = "+pivot);
        System.out.println("index = "+ans);
    }
    static int findingInRotatingArray(int[] arr, int target){
        int pivot = findingPivot(arr);
        if(arr[pivot]==target){
            return pivot;
        }
        if(arr[0]<arr[arr.length-1]){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[0]<target){
            return binarySearch(arr,target,0,pivot-1);
        }else {
            pivot += 1;
            return binarySearch(arr,target,pivot,arr.length-1);
        }
    }
    static int findingPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
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
    static int binarySearch(int[] arr, int target, int start , int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]> target){
                end = mid-1;
            } else if (arr[mid]<target) {
                start = mid+1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
