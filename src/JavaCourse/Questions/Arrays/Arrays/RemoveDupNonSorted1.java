package JavaCourse.Questions.Arrays.Arrays;

import java.util.Arrays;

public class RemoveDupNonSorted1 {
    public static void main(String[] args) {
        int[] nums= {2,1,4,2,1,3};
        System.out.print("Unsorted Array Inputs = ");
        System.out.println(Arrays.toString(nums));
        int[] store = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                store[j]=nums[i];
                j++;
                for (int k = i+1; k < nums.length; k++) {
                    if(nums[i]==nums[k]){
                        if(nums[k]!=0){
                            store[j]=nums[k];
                            nums[k]=0;
                            j++;
                        }
                    }
                }
            }
        }
        System.out.print("Sorted Arrays = ");
        System.out.println(Arrays.toString(store));
        //Ascending the arrays value
        int temp = 0;
        for (int i = 0; i < store.length; i++) {
            for (int k = i+1; k < store.length ; k++) {
                if(store[i]>store[k]){
                    temp = store[i];
                    store[i]=store[k];
                    store[k]=temp;
                    break;
                }
            }
        }
        System.out.print("In Ascending order = ");
        System.out.println(Arrays.toString(store));
        //RemovingDuplicates
        int hold = 0;
        for (int i = 0; i < store.length-1; i++) {
            if(store[i]!=store[i+1]){
                store[hold]=store[i];
                hold++;
            }
        }
        store[hold]=store[store.length-1];
        hold++;
        for (;hold< store.length;hold++){
            store[hold]=0;
        }
        System.out.print("DuplicateRemoved = ");
        System.out.println(Arrays.toString(store));



    }
}
