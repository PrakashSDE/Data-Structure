import java.util.Scanner;

public class ReverseIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int reverseNumber = 0;
        while (n>0){
            int id=n%10;
            reverseNumber = reverseNumber*10 + id;
            n=n/10;
        }
        System.out.println(reverseNumber);
    }
}
