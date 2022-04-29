package packages;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        pattern8(n);
    }

    private static void pattern8(int n) {

        for(int i = 1; i <= n; i++) {
            // Space loop
            for(int j=1; j <= n-i; j++) {
                System.out.print("  ");
            }

            // Star Loop
            for(int j=1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }

}
