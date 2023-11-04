//Write a java program to input any number and find out if it’s odd or even.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }
}
