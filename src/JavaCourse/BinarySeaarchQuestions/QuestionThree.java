package JavaCourse.BinarySeaarchQuestions;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = {'c','f','j'};
        char target = 'l';
        char ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static char binarySearch(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
//            if (letters[mid]<target) {
//                start = mid+1;
//            }else {
//                end = mid-1;
//            }
        }
        return arr[start%arr.length];
    }
}
