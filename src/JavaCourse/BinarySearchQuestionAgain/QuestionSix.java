package JavaCourse.BinarySearchQuestionAgain;

public class QuestionSix {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,4,2,1};
        int ans = binarySearch(arr);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start= mid+1;
            }else {
                end = mid;
            }
        }
        return start;
    }
}
