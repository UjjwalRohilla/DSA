package JavaCourse.BinarySeaarchQuestions;

public class QuestionSix {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,8,9,45,80,333,4,3};
        int ans = binarySearch(arr);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start!=end){
            int mid = start+(end-start)/2;
//            if( arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
//                return mid;
//            }
            if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
