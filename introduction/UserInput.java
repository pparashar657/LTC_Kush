package introduction;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner kush = new Scanner(System.in);

//        System.out.println("Enter your address");
//        String address = kush.nextLine(); // taking string input [multiple words]
//        System.out.println(address);
//
//        System.out.println("Enter any int number");
//        int a = kush.nextInt(); // Taking int input
//
//        System.out.println("The number that you entered is: " + a);
//
//        System.out.println("Enter any float number");
//
//        float b = kush.nextFloat(); // taking float input
//        System.out.println(b);
//
//        System.out.println("Enter any double number");
//
//        double c = kush.nextDouble(); // taking double input
//        System.out.println(c);
//
//        System.out.println("Enter your name");
//        String name = kush.next(); // taking string input [single string without space]
//        System.out.println(name);

        System.out.println("Enter any character");
        char ch = kush.next().charAt(0);

        System.out.println(ch);

    }

}
