//Write a Java program to calculate the average value of array elements.

public class Q22 {

    public static void main(String[] args) {
        double[] arr = {13, 19.93, 28.2, 53, 38.9};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }

        double average = total / arr.length;

        System.out.format("The average is: %.3f", average);
    }
}
