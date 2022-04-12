package introduction;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter another number : ");
        int num2 = sc.nextInt();

        System.out.println("The numbers before swapping : ");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

//        Some logic with extra variable

//        int temp = num1;
//        num1 = num2;
//        num2 = temp;

        // logic without extra variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;


        System.out.println("The numbers after swapping : ");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
//        System.out.println("Temp = " + temp);

    }

}
