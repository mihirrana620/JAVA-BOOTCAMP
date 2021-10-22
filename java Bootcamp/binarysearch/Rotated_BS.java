package binarysearch;


// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

public class Rotated_BS {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2 };
        System.out.println(findPivot(arr));
        int[] arr2 = { 2, 2, 9, 5, 2 };
        System.out.println(findPivotwithDuplicate(arr2));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // If you did not find pivot means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found , you have found two ascending sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // Find the middle element
            // int mid = (start + end)/2; // might be possible if mid value exceeds the
            // range of int

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // This will not work for duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int findPivotwithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // If elemetns at middle start and end are equal then just skip the duplicates

            if (arr[mid] == arr[start] && arr[mid] == arr[start]) {
                // Skip the duplicates

                // NOTE: What if these elements at start and end are pivot
                // check wheter start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check wheter end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted , so pivot should be in right

            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
