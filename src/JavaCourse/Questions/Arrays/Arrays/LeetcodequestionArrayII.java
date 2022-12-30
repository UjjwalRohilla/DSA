package JavaCourse.Questions.Arrays.Arrays;

public class LeetcodequestionArrayII {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,3};
        int number = 0;
        int count = 1;
        int[] array = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            {
                if(count==1);
                {
                    number++;
                    nums[j]=nums[i];
                    j++;
                }
                if(i>nums.length-1){
                    {
                        if(nums[i]==nums[i+1]){
                            count++;
                            if(count==2){
                                number++;
                                nums[j]=nums[i];
                                j++;
                            }
                        }
                        else{
                            count=1;
                        }
                    }
                }
                nums=array;
            }
        }
    }
}
