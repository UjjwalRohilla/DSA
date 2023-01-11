package JavaCourse.BinarySeaarchQuestions;

public class QuestionFourBruteForce {
    public static void main(String[] args) {
        int[] arr= {5,7,7,7,7,8,8,10};
        int target = 7;
        int start = 0;
        int end = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                start = i;
                break;
            }
        }
        for (int j=end; j > 0 ; j--) {
            if(arr[j]==target){
                end=j;
                break;
            }
        }
        System.out.println(start+ " "+end);
    }
}
