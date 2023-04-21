public class RotatedArray {
    public static void main(String[] args) {
        int[] arr ={1,2,7,9,10,14};
        rightRotated(arr,4);
    }

    public static void rightRotated(int[] nums, int k){
        int[] nums2 = new int[nums.length];
        int j=0;
        for(int i= (nums.length - k);i<nums.length;i++){
            nums2[j]=nums[i];
            j++;
        }



        for(int i=0; k<nums.length; i++){
            nums2[k]=nums[i];
            k++;
        }

        System.arraycopy(nums2, 0, nums, 0, nums.length);

        for(int a: nums){
            System.out.println(a);
        }



    }
}
