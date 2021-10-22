public class maxitemarray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,2));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }

        
        return maxVal;

    }



static int maxrange(int[] arr, int start, int end) {
    int maxVal = arr[0];
    for (int i = start; i < end; i++) {
        if (arr[i] > maxVal) {
            maxVal = arr[i];
        }

    }
    return maxVal;

}
}
