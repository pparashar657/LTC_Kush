package introduction.loops;

import java.util.Scanner;

public class PrintZigZag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");

        int num = sc.nextInt();

        for(int lb = 1, ub = num; lb <= ub; lb += 1, ub -= 1) {
            System.out.print(lb +" " + ub +" ");
        }


    }

}
