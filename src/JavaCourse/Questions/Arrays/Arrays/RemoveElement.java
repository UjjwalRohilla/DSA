package JavaCourse.Questions.Arrays.Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                nums[i]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
