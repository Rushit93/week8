/*Declare multidimensional array and store 5 countries and their capital and
print them in console.
 */

public class Q3 {

    public static void main(String[] args) {

            String[][] countrieswithcapitals = {{"India", " New Delhi"},
                    {"Australia", "Canberra"},
                    {"USA", "Washington DC"},
                    {"New Zealand", "Wellington"},
                    {"UK", "London"}};
            int C;
            for (C = 0; C <= countrieswithcapitals.length - 1; C++) {              //For Loop
                System.out.println(C);
                System.out.println("Country Name: " + countrieswithcapitals[C][0]);
                System.out.println("Capital of the Country is: " + countrieswithcapitals[C][1]);
            }
        }
    }
