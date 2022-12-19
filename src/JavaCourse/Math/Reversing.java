package JavaCourse.Math;

import java.util.Scanner;

//public class Reversing {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int number,remainder,reverse=0;
//        System.out.print("Enter any number you want to reverse ");
//        number = in.nextInt();
//        for (;number!=0;number=number/10){
//            remainder = number%10;
//            reverse = reverse*10+remainder;
//        }
//        System.out.println(reverse);
//    }
//}
//  public class Reversing {
//    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        int number;
//        number = in.nextInt();
//        int sNUmber= reverse(number);
//        System.out.println(reversed);
//
//    }
//    static int reversed=0;
//    static int reverse(int a){
//        for(;a!=0;a=a/10){
//            int remainder = a%10;
//
//            reversed=reversed*10+remainder;
//        }
//        return reversed;
//    }
//}

   public class Reversing {
       public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int number = in.nextInt();
           int reverse = 0;
           int remainder = 0;
           for(;number!=0;number=number/10){
               remainder = number%10;
               reverse = reverse*10+remainder;
           }
           System.out.println(reverse);
       }
}

















