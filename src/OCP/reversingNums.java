package OCP;

public class reversingNums {
    public static void main(String[] args){
        int value = 193456;
        int rev = 0;
        for(;value>0;value = value/10){
            rev = rev*10 + (value%10);
        }
        System.out.println(rev);
    }
}
