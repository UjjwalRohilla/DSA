package JavaCourse.Questions.Arrays.Arrays;



public class Ques1 {
    public static void main(String[] args) {
        int[] result=new int[2];

    }
    static int[] twosum(int[]nums,int target){
        for (int i = 0; i < nums.length ; i++) {
            for (int j =i+1; j < nums.length ; j++) {
                int complement = target-nums[i];
                if(nums[j]==complement){
                    return new int[]{i,j};
                }
            }

        }
        return nums;
    }
}