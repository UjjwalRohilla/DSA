package JavaCourse.Math;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        int number,remainder,reverse=0;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        int storeNumber = number;
        for(;number!=0;number=number/10){
            remainder=number%10;
            reverse=reverse*10+remainder;
        }
        System.out.println(storeNumber);
        System.out.println(reverse);
        if(storeNumber==reverse){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
