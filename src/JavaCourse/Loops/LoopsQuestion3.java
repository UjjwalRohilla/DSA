package JavaCourse.Loops;

import java.util.Scanner;

public class LoopsQuestion3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        //Question 3 For loop method...
        System.out.print("Enter any positive interger here ");
        int npt = in.nextInt();
        int s = 0;
        if(npt%2==0){
            for(int i=1;i<=10;i++){
                System.out.println(s=npt*i);
            }
        }else {
            System.out.println("The number that you have entered here is not positive number please enter any positive number");
        }
    }
}
