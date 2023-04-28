package LeetCodeQuestions;

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        int ans = searchInsert(arr,target);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
}
