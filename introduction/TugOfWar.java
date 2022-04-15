package introduction;

import java.util.Scanner;

public class TugOfWar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int sum = (n * (n+1))/2;
            if(sum % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }

}
