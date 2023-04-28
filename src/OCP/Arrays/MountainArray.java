package OCP.Arrays;

import java.util.Scanner;

public class MountainArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i<n ; i++){
            array[i] = sc.nextInt();
        }

        for (int j = 0; j<n; j++){
            if(array[j+1] < array[j]){
                System.out.println("Peak element is: " + array[j]);
                break;
            }
            else continue;
        }

    }
}
     /*         item             value                      weight
     *        1. 1 gold               20                         8
     *        2. 6 bottle              3                         10
     *        3. 1 laptop              10                         25
     *        4. 3 diamond             50                          3
     *
     *          backpack   MaxWeight = 6
     *          profit maximum =
     * */