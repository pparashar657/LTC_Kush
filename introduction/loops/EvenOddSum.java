package introduction.loops;

import java.util.Scanner;

public class EvenOddSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        int curr = 1;
        int oddSum = 0;
        int evenSum = 0;

        while (curr <= n){
            if(curr%2 == 0){
                evenSum = evenSum + curr;
                System.out.print(curr +" + ");
            }
            curr++;
        }
        System.out.println(" = " + evenSum);

        curr = 1;
        while (curr <= n){
            if(curr%2 == 1){
                oddSum = oddSum + curr;
                System.out.print(curr +" + ");
            }
            curr++;
        }

        System.out.println(" = " + oddSum);
    }

}
