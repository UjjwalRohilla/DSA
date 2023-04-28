package LeetCodeQuestions;

import java.util.Scanner;

public class addDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isdouble = true ;
        int whatOP =0;
        int ans = -1;
        while(isdouble){
            int num = in.nextInt();
            if(num<=9){
                ans = num;
                isdouble = false;
                whatOP = num;
                break;
            }
            int part1, part2;
            part1 = num%10;
            part2 = num/10;
            int total = 0;
            total = part1+part2;
            if(total<=9){
                ans = total;
                isdouble = false;
                whatOP = num;
                break;
            }
        }
        System.out.println("output of "+whatOP+" is "+ans+" yes addition of "+whatOP+" is a single digit");
    }
//    static int methodForAddDigits(int input){
//        int num = 0;
//        boolean isDouble = true;
//        if(input>9){
//            while(isDouble){
//                int temp = 0;
//                temp = input%10;
//                num = (num/10)+temp;
//                if(num<=9){
//                    isDouble = false;
//                }
//            }
//        }else {
//            return input;
//        }
//        return num;
//    }
}
