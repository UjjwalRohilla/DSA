package JavaCourse;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;
public class main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number one , two , or three\n one is \"Rock\"\n two is \"Scissor\"\n three is \"Paper\"");
       /*int player1 = sc.nextInt();
       int ai1 = (int)(Math.random()*(3-1+1)+1);
       System.out.println("You chose number"+player1);
       System.out.println("CPU chose number"+ai1);
       if(player1==ai1){
           System.out.println("Draw");
       } else if (player1==1 && ai1==2) {
           System.out.println("You win...Rock>Scissor...");
       } else if (player1==1 && ai1==3) {
           System.out.print("You lose...Rock<Paper...");
       } else if (player1==2 && ai1==1) {
           System.out.println("You lose...Scissor<Rock...");
       } else if (player1==2 && ai1==3) {
           System.out.println("You win...Scissor>Paper... ");
       } else if (player1==3 && ai1==1) {
           System.out.println("You win...Paper>Rock... ");
       } else if (player1==3 && ai1==2) {
           System.out.println("You lose...Paper<Scissor...");
       }*/
       int a = 7;
       int b = 0;
       int by= 11;
       while(by<=10){
           b = a*by;
           System.out.println("7x"+by+"="+b);
           by++;

       }


    }
}
