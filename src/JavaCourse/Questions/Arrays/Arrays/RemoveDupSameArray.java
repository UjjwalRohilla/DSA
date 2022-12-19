package JavaCourse.Questions.Arrays.Arrays;

import java.util.Arrays;

public class RemoveDupSameArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,5,5};
        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i];
                j++;
            }
        }nums[j]=nums[nums.length-1];
        System.out.println(Arrays.toString(nums));

    }
}
