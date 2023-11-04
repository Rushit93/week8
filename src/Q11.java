/*Input any alphabet from “A" to “F” and print their city name accordingly
(use if else) if any other alphabet should be invalid entry.
 */

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

         {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter character between A to F : " );
            char city = sc.next().charAt(0);
            if(city == 'A'){
                System.out.println("Anand");
            }
            else if (city == 'B') {
                System.out.println("Berlin");
            }
            else if (city == 'C') {
                System.out.println("Charlotte");
            }
            else if (city == 'D'){
                System.out.println("Denver");
            }
            else if (city == 'E'){
                System.out.println("Edinburgh");
            }
            else if (city == 'F'){
                System.out.println("Frankfurt");
            }
            else {
                System.out.println("Invalid Entry");
            }

        }
    }

}
