package introduction.loops;

import java.util.Scanner;

public class FibonacciInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start");
        int start = sc.nextInt();
        System.out.println("Enter the end");
        int end = sc.nextInt();

        int first = 0;
        int second = 1;
        int third = 1;

        while(third < end) {
            if(third >= start) {
                System.out.print(third + " ");
            }
            first = second;
            second = third;
            third = first + second;
        }
    }

}
