/*Write if else condition and print your group name
in console else others group name.
 */

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner group = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 5: ");
        int groupname1 = group.nextInt();
        if (groupname1 == 1) {                          //if-else conditional statement
            System.out.println("Code 1");
        } else if (groupname1 == 2) {
            System.out.println("Code 2");
        } else if (groupname1 == 3) {
            System.out.println("RESTASSURED");
        } else if (groupname1 == 4) {
            System.out.println("JAVA");
        } else if (groupname1 == 5) {
            System.out.println("AGILE");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}

