import java.util.Scanner;
public class Check_if_Array_Is_Sorted_and_Rotated {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                ++count;
            }
        }
        return (count <= 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter %d elements of the array:%n", size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("The array you entered is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
            boolean result = (check(arr));
            if (result) System.out.println("  Given array is Sorted and Rotated");
            else System.out.println("  Given array is not Sorted and Rotated");
        }
    }


