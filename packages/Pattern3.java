package packages;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        pattern3(n);
    }

    private static void pattern3(int n) {

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
