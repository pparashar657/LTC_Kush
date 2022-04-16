package introduction.loops;

import java.util.Scanner;

public class SumFirstN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        int sum = 0;

        for(int curr = 1; curr <= n; curr++) {
            sum = sum + curr;
        }
        System.out.println("The sum of first " + n + " numbers = " + sum);
    }

}
