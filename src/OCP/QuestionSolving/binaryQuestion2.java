package OCP.QuestionSolving;

import java.util.Scanner;

public class binaryQuestion2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] arr = {'c','f','i','n'};
        char target = in.next().charAt(0);
        char ans = charBinarySearch(arr,target);
        System.out.println(ans);
    }
    static char charBinarySearch(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
