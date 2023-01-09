package JavaCourse.BinarySeaarchQuestions;

public class QuestionThreeWayTwo {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'z';
        char ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static char binarySearch(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        if (target>=arr[end]){
            return arr[0];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else {
                start= mid+1;
            }
        }
        return arr[start];
    }
}
