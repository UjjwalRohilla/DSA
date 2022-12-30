package JavaCourse.Questions.Arrays.Arrays;

public class RoughForQuestions {
    public static void main(String[] args) {
        int[] a = {5,2,1,3};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[i+1]){
                    System.out.println("true");
                    break;
                }
            }
        }
    }
}
