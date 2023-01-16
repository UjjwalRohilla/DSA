package JavaCourse.BinarySeaarchQuestions;

public class QuestionFive {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 11;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = 2;
        while(start<=end){
            if(arr[start]<target && arr[end]>target){
                int mid = start+(end-start)/2;
                if(arr[mid]>target){
                    end = mid-1;
                } else if (arr[mid]<target) {
                    start = mid+1;
                }else {
                    return mid;
                }
            }else {
                end = end*2;
            }
        }
        return -1;
    }
}
