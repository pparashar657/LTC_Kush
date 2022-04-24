package introduction.loops;

import java.util.Scanner;

public class NumToDigits2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        long num = sc.nextLong();

        int totalDigits = 0;

        long temp = num;
        while(temp > 0) {
            temp = temp/10;
            totalDigits++;
        }

        long exp = (long)Math.pow(10, (totalDigits - 1));

        while(num > 0) {
            long digit = num/ exp;
            System.out.println(digit);
            num = num % exp;
            exp = exp/ 10;
        }
    }

}
