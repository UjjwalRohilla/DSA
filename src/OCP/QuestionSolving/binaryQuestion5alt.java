package OCP.QuestionSolving;

public class binaryQuestion5alt {
    public static void main(String[] args) {
        int[] arr = {2,25,33,43,52,225,125,90,55,23,1};
        int target = 33;
        int ans = findInMountainArray(arr,target);
        System.out.println(ans);
    }
    static int findInMountainArray(int[] arr, int target){
        int peak = peakMountainArray(arr);
        int start = 0;
        int end = peak;
        int ans = -1;
            ans = binarySearch(arr,target,start,end,true);
        if(arr[ans]!=target){
            start = peak;
            end = arr.length-1;
            ans = binarySearch(arr,target,start,end,false);
        }
        return ans;
    }
    static int peakMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid+1]>arr[mid]){
                start = mid+1;
            } else if (arr[mid-1]>arr[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;

    }
    static int binarySearch(int[] arr, int target,int start,int end,boolean isAcsending){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                if(isAcsending){
                    end = mid-1;
                }else {
                    start= mid+1;
                }
            } else if (arr[mid]<target) {
                if(isAcsending){
                    start = mid + 1;
                }else {
                    end = mid-1;
                }
            }else {
                return mid;
            }
        }
        return start;

    }
}
