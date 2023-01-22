package JavaCourse.BinarySeaarchQuestions;

public class QuestionSeven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start!=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                if(arr[mid]==arr[mid-1]){
                    end = mid-1;
                }
            }
        }
        return ans;
        //INCOMPLETE
    }
}
