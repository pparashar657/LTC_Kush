package introduction;

import java.util.Scanner;

public class TempConv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the unit (C or F)");
        char unit = sc.next().charAt(0);

        System.out.println("Enter the temperature: ");
        float temp = sc.nextFloat();

        float convertedTemp = 0;

        if(unit == 'C') {
            convertedTemp = (float)((9.0/5)*temp + 32);
            System.out.println("The temp in Fahrenheit is " + convertedTemp);
        } else if(unit == 'F'){
            convertedTemp = (float) ((temp - 32) * (5.0/9));
            System.out.println("The temp in celcius is " + convertedTemp);
        } else {
            System.out.println("Wrong unit!!!!!!");
        }

    }

}
