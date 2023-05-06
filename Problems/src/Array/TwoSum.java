package Array;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int [] twoSum(int[] nums , int targat){

        for(int i=0;i<nums.length;i++ ){
            for(int j=i+1;j<nums.length; j++){
                if(nums[i]+nums[j]==targat) return new int[] {i, j};
            }
        }
        return new int[] {};
    }

    public static int [] twoSumOptimal(int[] nums , int targat){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complement = targat-nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }


    public static void main(String[] args) {
     int [] arr = { 3,2,4};
        String ans = Arrays.toString(twoSumOptimal(arr,6));
        System.out.println(ans);
    }
}
