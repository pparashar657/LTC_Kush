package introduction.loops;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");

        printNFibo(5);
        printNFibo(10);
        printNFibo(20);

    }

    private static void printNFibo(int n) {
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
