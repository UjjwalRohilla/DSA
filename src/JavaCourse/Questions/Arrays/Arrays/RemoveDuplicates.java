package JavaCourse.Questions.Arrays.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums= {1,2,2,2,3,4,4,5};
        int[] store = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                store[j]=nums[i];
                j++;
            }
        }store[j]=nums[nums.length-1];
        System.out.println(Arrays.toString(store));

    }
//    static int[] removeduplicate(int[]nums){
//        int[] store= new int[30];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length ; j++) {
//                if(nums[i]==nums[j]){
//                    store[i]=nums[i];
//                }
//                else {
//                    store[i]=nums[i];
//                    store[j]=nums[j];
//                }
//
//            }return store;
//
//        }
//        return store
    }
//}
