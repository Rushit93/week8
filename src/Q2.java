//Declare array and store any 5 countries and print them in console.

public class Q2 {

    public static void main(String[] args) {

        // create an array
        String[] Countries = {"India", "UK", "USA", "New Zealand", "Australia"};

        int C;
        System.out.println(Countries);
        for (C = 0; C <= Countries.length - 1; C++) {          //For Loop
            System.out.println(Countries[C]);
        }
    }
}
