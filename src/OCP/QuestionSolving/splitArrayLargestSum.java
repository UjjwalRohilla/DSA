package OCP.QuestionSolving;

public class splitArrayLargestSum {
    public static void main(String[] args){
        int[] arr = {7,2,5,8,10};
        int m = 2;
        int ans = splitArraySol(arr,m);
        System.out.println(ans);
    }
    static int splitArraySol(int[] arr, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        //Binary search
        while(start<end) {
            int mid = start + (end - start) / 2;
            // now mid is a potential answer...
            int sum = 0;
            int pieces = 1;
            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > mid) {
                    sum = arr[i];
                    pieces++;
                } else {
                    sum += arr[i];
                }
            }
            if (pieces<m){
                end = mid;
            }else {
                start = mid+1;
            }
            /*if (pieces>m){
                start = mid+1;
            }else {
                end = mid;
            }*/
        }
        return end;
    }
}
