package packages;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        pattern2(n);
    }

    private static void pattern2(int n) {

        for(int rowNo = 1; rowNo<= n; rowNo++) {
            for(int colNo = 1; colNo <= rowNo; colNo++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
