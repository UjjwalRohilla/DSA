package OCP.QuestionSolving;

import java.util.Arrays;
import java.util.Scanner;

public class binaryQuestion3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {2,5,7,7,7,7,8,10,15,20,25,26,27};
        int target = in.nextInt();
        int[] ans = startAndEnd(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] startAndEnd(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = binarySearch(arr,target,true);
        if(ans[0]!=-1){
            ans[1]=binarySearch(arr,target,false);
        }
        return ans;
    }
    static int binarySearch(int[] arr, int target,boolean istrue){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                if(istrue==true){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = end+1;
            }
        }
        return ans;
    }
}
