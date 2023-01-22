package JavaCourse.BinarySearchQuestionAgain;

import java.util.Arrays;

public class QuestionFour {
    public static void main(String[] args) {
        int[] arr = {5,5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = firstAndLast(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] firstAndLast(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0]= binarySearch(arr,target,true);
        if(ans[0]!=-1){
            ans[1]= binarySearch(arr,target,false);
        }
        return ans;
    }
    static int binarySearch(int[] arr,int target,boolean firstNumOrLastNo){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                if(firstNumOrLastNo==true){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
}
