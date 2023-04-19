import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
         int[] arr ={4,5,4,5,5,5,9};
         int k=Duplicates(arr);
         for(int i=0;i<k;i++){
             System.out.println(arr[i]+" ");
         }
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
        return temp.size();

    }
}
