package introduction.loops;

import java.util.Scanner;

public class RotateNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        System.out.println("Enter value of K: ");
        int k = sc.nextInt();

        int totalDigits = 0;

        int temp = num;
        while(temp > 0) {
            temp /= 10;
            totalDigits++;
        }

        int exp = (int)Math.pow(10, k);
        int rem = num % exp;
        int qu = num / exp;

        int ans = (int)(rem * Math.pow(10, totalDigits-k) + qu);

        System.out.println("After rotation num = " + ans);
    }

}
