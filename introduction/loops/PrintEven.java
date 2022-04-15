package introduction.loops;

import java.util.Scanner;

public class PrintEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("enter your last number : ");
        int num2 = sc.nextInt();

        while(num1 <= num2) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1 = num1 + 1;
        }
    }

}
