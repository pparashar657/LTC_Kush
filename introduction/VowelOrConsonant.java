package introduction;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");

        char ch = sc.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("You entered a vowel"); break;
            default: System.out.println("You entered a consonant");
        }
    }

}
