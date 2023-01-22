package JavaCourse.BinarySearchQuestionAgain;

public class QuestionOne {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 18;
        int indexAns = binarySearch(arr,target);
        int valueAns = arr[indexAns];
        System.out.println(indexAns + " "+valueAns);
    }
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
}
