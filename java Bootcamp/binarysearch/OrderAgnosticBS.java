package binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 18, 22, 45, 89 };
        int[] arr = { 99,88,75,22,11,10,5,2,-3 };
        int target = 22;
        int ans = OrderagnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OrderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find whether the array is sorted in ascending or descending

        // Find the middle element
        // int mid = (start + end)/2; // might be possible if mid value exceeds the
        // range of int

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;

    }

}
