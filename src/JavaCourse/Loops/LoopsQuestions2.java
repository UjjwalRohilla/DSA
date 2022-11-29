package JavaCourse.Loops;

import java.util.Scanner;

public class LoopsQuestions2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Question 2 ...my method...
        int i = 1;
        int s = 0;
        for(int a=1;a<=10;a++){
            System.out.println(s+=i);
            i++;
        }
        //Question 2 online solved.....
        /*int sum = 0;
        for(int i=1; i<=10; i++)
        {
            sum += i;
            System.out.println(sum);
        }
        System.out.println("Sum: " + sum);*/
    }
}
