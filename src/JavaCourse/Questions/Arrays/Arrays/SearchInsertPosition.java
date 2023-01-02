package JavaCourse.Questions.Arrays.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arrIn = {1,3,5,7};
        int ans = searchInsert(arrIn,6);
        System.out.println(ans);
    }
    static int searchInsert(int[] nums, int target) {
        int index = 0;
        for(;index<nums.length;index++){
            if(nums[index]==target){
                return index;
            }
            if(nums[index]<target & nums[index+1]>target){
                index++;
                return index;
            }
        }
        return -1;
    }
}
