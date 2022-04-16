package introduction.loops;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        int curr = 2;
        boolean isPrime = true;
        while(curr < num) {
            if(num % curr == 0) {
                isPrime = false;
                break;
            }
            curr++;
        }

        if(isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }


    }

}
