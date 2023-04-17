public class SelectionSort {

    public static void selectionSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        //print the element of the sorting array.
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
    public static void main(String[] args) {
      int test[]={5,65,9,25,7,1,25,62,2,52};
      selectionSort(test);
    }
}
