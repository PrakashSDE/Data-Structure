package Array;
public class Rearrange {
    public static void main(String[] args) {
        int nums[] = {1,-5,4,6,-5,-9,7,-2};
        int pos[]=new int[nums.length/2];
        int nev[]=new int[nums.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }
            else{
                nev[n]=nums[i];
                n++;
            }
        }

        int temp[]=new int[nums.length];
        int k=0;
        int m=0;
        for(int j=0;j<nums.length;j++){
            temp[j]=pos[k];
            k++;
            j++;
        }
        for(int j=1;j<nums.length;j++){
            temp[j]=nev[m];
            m++;
            j++;
        }

        for(int a: temp){
            System.out.println(a);
        }
     
    }
    }

