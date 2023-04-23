public class Movezeros {
    public static void main(String[] args) {
        int arr[] ={ 1,2,0,1,0,4,0};
        zerosToEnd(arr);
        moveZeroes(arr);
    }

    public static void zerosToEnd(int [] nums){
        int n=nums.length;
        int[] temp = new int[n];
        int count=0;
        for(int i=0; i<n;i++) {
            if (nums[i] != 0) {
                temp[count] = nums[i];
                count++;
            }
        }
        while(count<n) {
            temp[count]=0;
            count++;
        }
        }
        public static void moveZeroes(int[] nums) {
            int j = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                }
            }
            for(int a: nums){
                System.out.println(a);
            }
        }
    }


