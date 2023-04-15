import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pattern8(num);
    }

    public static void pattern1(int n) {
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i <= n; i++) {
                System.out.print("  *  ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  *  ");

            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(n-j+1+" ");

            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int j =0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            for(int j=0;j< 2*i+1;j++){
                System.out.print("*");
            }

            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

}
