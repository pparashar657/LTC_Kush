package introduction.loops;

import java.util.Scanner;

public class DigitToNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many digits: ");
        int n = sc.nextInt();

        int ans = 0;

        System.out.println("Enter the digits: ");

        while(n-- > 0) {
            int digit = sc.nextInt();
            ans = ans * 10 + digit;
        }

        System.out.println("The num = " + ans);

    }

}
