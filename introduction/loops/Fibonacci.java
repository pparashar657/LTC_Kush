package introduction.loops;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int third;

        while(n-- > 0) { // This will also work n times. (Style)
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }

}
