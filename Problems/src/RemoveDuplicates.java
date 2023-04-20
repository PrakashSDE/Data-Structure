import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
         int[] arr ={1,2,2,7,9,9,10,14};
         Duplicates(arr);
         for(int a: arr){
             System.out.println(a);
         }

    }
    //Using HashSet
    public static int duplicateHashSet(int[] nums){
        HashSet<Integer> temp=new HashSet<>();

        for (int num : nums) {
            temp.add(num);
        }

        int j=0;
        for(int set: temp){
            nums[j++]=set;
        }
        for(int i=0;i< temp.size();i++){
            System.out.println(nums[i]);
        }
        return temp.size();

    }

    public static int Duplicates(int[] nums){
        int ptr=0;
        for(int i=1;i<nums.length;i++){
            if(nums[ptr]!=nums[i]){
                ptr++;
                nums[ptr]=nums[i];
            }
        }
        return ptr+1;
    }
}
