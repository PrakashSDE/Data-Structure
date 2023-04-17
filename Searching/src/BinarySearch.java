public class BinarySearch {
    public static int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // If element is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = { 12, 23, 35, 41, 69, 75 }; // Sorted sample array
        int x = 41; // Element to be searched
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
