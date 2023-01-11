package JavaCourse.BinarySeaarchQuestions;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,7,7,7,7,8,8,10};
        int target= in.nextInt();
        int start = binarySearchStart(arr,target);
        int end = binarySearchEnd(arr,target);
        System.out.println(start+" "+end);
    }
    static int binarySearchStart(int[] arr,int target){
        int start= 0;
        int end = arr.length-1;
        int startAns = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                startAns=mid;
                end = mid-1;
            } else if (arr[mid]>target) {
                end= mid-1;
            }else {
                start=mid+1;
            }
        }
        return startAns;
    }
    static int binarySearchEnd(int[] arr,int target){
        int start= 0;
        int end = arr.length-1;
        int endAns =0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                endAns=mid;
                start = mid+1;
            } else if (arr[mid]>target) {
                end= mid-1;
            }else {
                start=mid+1;
            }
        }
        return endAns;
    }
}
