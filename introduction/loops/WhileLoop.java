package introduction.loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
//        int a = 1;
//        while(a < 10) {
//            System.out.print(a +" ");
//            a = a + 1;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while(num1 <= num2){
            System.out.println(num1);
            num1 = num1 +1;


        }

    }

}
