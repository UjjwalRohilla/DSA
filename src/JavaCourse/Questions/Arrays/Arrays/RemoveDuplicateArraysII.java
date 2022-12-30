package JavaCourse.Questions.Arrays.Arrays;

import java.util.Arrays;

public class RemoveDuplicateArraysII {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,3};
        int j = 0;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
                for(int k = i+1;k<3;k++){
                    if(nums[k]==nums[i]){
                        nums[j]=nums[k];
                        j++;
                        for(int p =2;p< nums.length;p++){
                            if(nums[p]==i){
                                nums[p]=0;
                            }
                        }
                    }
                }
//                for(int p =2;p< nums.length;p++){
//                    if(nums[p]==i){
//                        nums[p]=0;
//                    }
                }
            }
            System.out.println(Arrays.toString(nums));
        }

    }


