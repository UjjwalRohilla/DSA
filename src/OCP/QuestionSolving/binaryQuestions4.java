package OCP.QuestionSolving;

public class binaryQuestions4 {
    public static void main(String[] args){
//        int[] arr = {1,2,5,6,9,10,15,11,8,5};
        int[] arr = {1,2,3,4,3,2,1};
        int ans = mountainArray(arr);
        System.out.println(ans);
    }
    static int mountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid+1]>arr[mid]){
                start = mid+1;
            } else if (arr[mid-1]>arr[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
