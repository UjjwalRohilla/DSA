package JavaCourse.BinarySeaarchQuestions;

public class QuestionThreeViceVersa {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'f';
        char ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static char binarySearch(char[] letters,char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (letters[mid]<target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
//            if (letters[mid]<target) {
//                start = mid+1;
//            }else {
//                end = mid-1;
//            }
        }
        return letters[end%letters.length];
    }
}
