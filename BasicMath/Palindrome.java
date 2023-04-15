import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindrome(n);
    }

    public static void palindrome(int x){
        int permanent=x;
        int reversNumber=0;
        while(x>0){
            int id = x%10;
            reversNumber=(reversNumber * 10) +id;
            x=x/10;
        }
        if(reversNumber==permanent){
            System.out.println("it is a palindrome number");
        }
        else
        {
            System.out.println("it is not a palindrome number");
         }
}
}
