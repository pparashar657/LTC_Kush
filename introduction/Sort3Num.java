package introduction;

import java.util.Scanner;

public class Sort3Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("The numbers in descending order are : ");

        if(n1 > n2 && n1 > n3) {
            if(n2 > n3) {
                System.out.println(n1 + " " + n2 + " " + n3);
            } else {
                System.out.println(n1 + " " + n3 + " " + n2);
            }
        } else if(n2 > n3) {
            if(n1 > n3) {
                System.out.println(n2 + " " + n1 + " " + n3);
            } else {
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        } else if(n1 > n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        } else {
            System.out.println(n3 + " " + n2 + " " + n1);
        }

    }

}
