package OCP;

import java.util.Scanner;

public class howMuchTarget {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value = 156489951;
        int target = in.nextInt();
        int count = 0;
        while(value>0){
            if (value%10==target){
                count++;
            }
            value = value/10;
        }
        System.out.println(count);
    }
}
