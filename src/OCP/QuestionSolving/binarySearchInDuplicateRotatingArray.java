package OCP.QuestionSolving;

public class binarySearchInDuplicateRotatingArray {
    public static void main(String[] args) {
        int[] arr = {2,2,6,7,8,2,2,2,2,2,2};
        int target = 7;
        int pivot = pivotInDuplicate(arr);
        System.out.println("pivot = "+pivot);
        int ans = findingTarget(arr,target);
        System.out.println(ans);
    }
    static int findingTarget(int[]arr,int target){
        int pivot = pivotInDuplicate(arr);


        if(arr[pivot]==target){
            return pivot;
        }
        if(arr[0]<target){
            return binarySearch(arr,target,0,pivot-1);
        }else {
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }

    }

    static int pivotInDuplicate(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start < end && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                } else {
                    start++;
                }
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                } else {
                    end--;
                }
                if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
