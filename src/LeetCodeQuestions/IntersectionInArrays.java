package LeetCodeQuestions;

import java.util.Arrays;

public class IntersectionInArrays {
    public static void main(String[] args){
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int[] ans;
        if(nums1Length<=nums2Length){
            return binarySearch(nums1,nums2,true,nums1Length);
        }else {
            return binarySearch(nums1,nums2,false,nums2Length);
        }
    }
    static int[] binarySearch(int[] arr1, int[] arr2, boolean isArr1, int valueForReturnSpace){
        int[] ans = new int[valueForReturnSpace];
        int index = 0;
        int start = 0;
        int end = 0;
        for (int toFind = 0; toFind < valueForReturnSpace; toFind++) {
            if(isArr1){
                end = arr2.length-1;
            }else {
                end = arr1.length-1;
            }
            while (start<=end){
                int mid = start+(end-start)/2;
                if(isArr1){
                    if(arr2[mid]==arr1[toFind]){
                        ans[index]=arr2[mid];
                        index++;
                        break;
                    } else if (arr2[mid]>arr1[toFind]) {
                        end = mid-1;
                    }else {
                        start= mid+1;
                    }
                }else {
                    if(arr1[mid]==arr2[toFind]){
                        ans[index]=arr1[mid];
                        index++;
                        break;
                    } else if (arr1[mid]>arr2[toFind]) {
                        end = mid-1;
                    }else {
                        start = mid+1;
                    }
                }
            }
        }
        return ans;
    }
}
