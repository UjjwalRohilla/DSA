package JavaCourse;

import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,34,38,50}
        };
        int target = 40;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int r = 0;
        int c = arr[0].length-1;
        while(r<arr.length&&c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            /*if(arr[r][c]<target){
                r++;
            }else {
                c--;
            }*/
            //experiment
            if(arr[r][c]>target){
                c--;
            }else {
                r++;
            }
            //Hence both if-else will work
        }
        return new int[] {-1,-1,};
    }
}
