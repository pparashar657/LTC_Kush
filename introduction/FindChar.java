package introduction;

import java.util.Scanner;

public class FindChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character : ");

        char ch = sc.next().charAt(0);

        if(ch >= '0' && ch <= '9') {
            System.out.println("You entered a number");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("You entered an alphabet");
        } else {
            System.out.println("You entered a special symbol");
        }
    }

}
