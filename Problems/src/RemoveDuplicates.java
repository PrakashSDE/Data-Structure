import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
         int[] arr ={4,5,4,5,5,5,9};
         Duplicates(arr);
    }

    public static int Duplicates(int[] nums){
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
}
