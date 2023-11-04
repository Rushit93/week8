/*Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)
 */


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);

        System.out.print("Enter any number: ");
        int num = reader.nextInt();

        String results = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + results);

    }
}
