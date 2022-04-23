package introduction.loops;

import java.util.Scanner;

public class RecurenceRel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, b and n");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int curr = 0;

        int first = 1;
        int second = 0;

        for (int i=0; i < n-1; i++) {
            curr = a * first + b * second;

            second = first;
            first = curr;
        }
        System.out.println(n + "th term of the series = " + first);

    }

}
