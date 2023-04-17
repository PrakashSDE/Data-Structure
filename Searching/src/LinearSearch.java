
public class LinearSearch {
    public static int search(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1; // If element is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 69, 75, 23, 41 }; // Sample array
        int x = 75; // Element to be searched
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
