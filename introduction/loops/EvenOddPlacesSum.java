package introduction.loops;

import java.util.Scanner;

public class EvenOddPlacesSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        int pos = 1;

        while(num > 0) {
            int digit = num % 10;
            if(pos % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            num = num/ 10;
            pos++;
        }
        System.out.println("Sum of even places digit = " + evenSum);
        System.out.println("Sum of odd places digit = " + oddSum);
    }

}
