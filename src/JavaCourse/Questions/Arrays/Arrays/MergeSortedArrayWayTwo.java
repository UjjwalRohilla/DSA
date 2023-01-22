package JavaCourse.Questions.Arrays.Arrays;

public class MergeSortedArrayWayTwo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int count1 = 0, count2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!= 0){
                count1++;
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if(arr2[j]!= 0){
                count2++;
            }
        }
        int[] ans = merge(arr1,count1,arr2,count2);
        System.out.println(ans+" ");
    }
    static int[] merge(int[] nums1,int n,int[] nums2,int m){
        int[] a = {2,1};
        return a;
    }
}
