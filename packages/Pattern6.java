package packages;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        pattern6_v3(n);
    }

    private static void pattern6(int n) {

        Pattern2.pattern2(n-1);
        Pattern3.pattern3(n);

    }

    private static void pattern6_v2(int n) {

        for(int row=1;row<2*n;row++) {
            int colMax = (row <= n) ? row : (2*n - row);
//            if(row <= n) {
//                colMax = row;
//            } else {
//                colMax = 2*n - row;
//            }
            for(int col=1; col<=colMax; col++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }

    private static void pattern6_v3(int n) {
        int item = 1;
        for(int row=1;row<2*n;row++) {
            int colMax = (row <= n) ? row : (2*n - row);

//            if(row <= n) {
//                colMax = row;
//            } else {
//                colMax = 2*n - row;
//            }
            for(int col=1; col<=colMax; col++) {
                System.out.print(item +" ");
            }
            item = (row < n)? item+1: item-1;
            System.out.println();
        }

    }

}
