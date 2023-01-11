package JavaCourse.BinarySeaarchQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourLearningKunalSol {
    public static void main(String[] args) {
        // mid value also by ME
        Scanner in = new Scanner(System.in);
        int[] arr = {5,7,7,7,7,7,8,8,10};
        int target = in.nextInt();
        int[] ans = binarySearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarySearch(int[] arr,int target){
        int[] ans = {-1,-1,-1};
        int start = -1;
        int end = -1;
        start= searchFistAndLast(arr,target,true);
        if(start!=-1){
            end= searchFistAndLast(arr,target,false);
        }
        ans[0]=start;
        ans[2]=end;
        int mid = start+(end-start)/2;
        ans[1]=mid;
        return ans;
    }
    static int searchFistAndLast(int[] array,int target,boolean searchFirstOrLast){
        int ans = -1;
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(array[mid]==target){
                ans = mid;
                if(searchFirstOrLast){
                    end = mid-1;
                }else {
                    start = mid+1;
                }

            } else if (array[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
}
