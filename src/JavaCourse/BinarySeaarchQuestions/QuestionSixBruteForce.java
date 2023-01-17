package JavaCourse.BinarySeaarchQuestions;

public class QuestionSixBruteForce {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,8,9,45,80,333,4,3};
        int ans = binarySearch(arr);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< arr[i+1]){
                ans = i+1;
            }else {
                break;
            }
        }
        return ans;
    }
}
