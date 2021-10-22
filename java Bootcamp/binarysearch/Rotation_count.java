package binarysearch;

public class Rotation_count {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

  static int countRotations(int[] arr) {
        int pivot = findPivot(arr);

        return pivot+1;
        // if(pivot == -1){
        //     // array is not rotated
        //     return 0;
        // }
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
            // If elements at middle start and end are equal then just skip the duplicates

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
