package JavaCourse.Questions.Arrays.Arrays;

import java.util.Arrays;

public class FindEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int count = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                count++;
            }
            if(count%2 == 0){
                ans++;
            }
        }
        System.out.println("Answer"+ ans);
    }
}
