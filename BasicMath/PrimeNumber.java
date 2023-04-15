import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        boolean ans=(primeCheck(x));
        if(x!=0 && ans == true) System.out.println("Given Number is a prime number");
        else System.out.println("Given number is not a prime number");
    }
    public static boolean primeCheck(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
