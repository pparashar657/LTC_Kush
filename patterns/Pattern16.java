package patterns;

import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        pattern16(n);
    }

    public static void pattern16(int n) {

        for(int i=1;i<n;i++) {
            // Outer space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            // Inner space
            for(int j=1;j<=2*i-3; j++)  {
                System.out.print(" ");
            }
            if(i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Last row
        for(int j=1;j<=2*n-1;j++) {
            System.out.print("*");
        }

    }

}
