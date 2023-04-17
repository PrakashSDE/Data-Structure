public class Check_if_Array_Is_Sorted_and_Rotated {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i+1)%n]){
                ++count;
            }
        }
        return (count <= 1);
    }

    public static void main(String[] args) {
        int arr[]={5,8,12,48,1,2,3};
        boolean result = (check(arr));
        if (result) System.out.println("Given array is Sorted and Rotated");
        else System.out.println("Given array is not Sorted and Rotated");
    }
}
