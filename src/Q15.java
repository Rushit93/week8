//Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        charcheck();
    }
    public static void charcheck() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a value: ");
        char value1 = value.next().charAt(0);
        if ((value1 >= 65 && value1 <= 90)
                || (value1 >= 97 && value1 <= 122)) {
            System.out.println("Entered Value is an Alphabet ");
        }
        else if (value1 >= 48 && value1 <= 57) {
            System.out.println("Entered Value is a Digit ");
        }
        else {
            System.out.println("Entered Value is a Symbol ");
        }
    }

}
