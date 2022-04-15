package introduction.loops;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        int curr = 1;
        do {
            if(curr % 2 == 0 || curr % 5 == 0) {
                System.out.println(curr);
            }
            curr += 1;
        } while(curr <= num);
    }

}
