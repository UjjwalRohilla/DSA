package JavaCourse.Questions.Arrays.Arrays;

public class SearchInsertPositionRough {
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
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
        while(p2 >=0 ){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
        return nums1;
    }
}


