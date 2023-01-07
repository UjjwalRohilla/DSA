package JavaCourse.Questions.Arrays.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,5,7,0,0,0};
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
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int arrInLen = m+n;
        int[] arrIn = new int[arrInLen];
        int input = 0;
        for (int a1 = 0; a1 < nums1.length; a1++) {
            if(nums1[a1]!= 0 ){
                arrIn[input]= nums1[a1];
                input++;
            }
        }
        for (int a2 = 0; a2 < nums2.length ; a2++) {
            if(nums2[a2]!=0){
                arrIn[input]=nums2[a2];
                input++;
            }
        }
        //sorting aarIn;
        int temp =0;
        for (int i = 0; i < arrIn.length-1; i++) {
            for (int j = i+1; j < arrIn.length ; j++) {
                if(arrIn[i]>arrIn[j]){
                    temp = arrIn[i];
                    arrIn[i]=arrIn[j];
                    arrIn[j]=temp;
                    break;
                }
            }
        }



        return arrIn;
    }
}
