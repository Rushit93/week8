//Write a Java program to sum values of an array.

public class Q21 {

    public static void main(String[] args) {
        int my_array[] = {13, 22, 53, 24, 75, 86, 67, 38, 49, 10};

        int sum = 0;

        for (int i : my_array)
            sum += i;

        System.out.println("The sum is " + sum);
    }

}