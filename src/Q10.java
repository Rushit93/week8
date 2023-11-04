/*Write a java program input sales id, seller's name, sales amount,
and salary basic and then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%

 */

import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        salescommission();
    }
    public static void salescommission(){
        Scanner sales = new Scanner(System.in);         //Scanner Class
        System.out.println("Enter Sales ID: ");
        int salesid = sales.nextInt();
        System.out.println("Enter Seller's Name: ");
        String sellersname = sales.next();
        System.out.println("Enter Sales Amount: ");
        double salesamount = sales.nextDouble();
        System.out.println("Enter Basic Salary");
        double basicsalary = sales.nextDouble();
        double commission = 0.0;
        if (salesamount >= 50000){                  //if else condition
            commission = 0.35;
        }
        else if (salesamount >= 30000) {
            commission = 0.20;
        }
        else if (salesamount >= 20000) {
            commission = 0.10;
        }
        else if (salesamount >= 10000) {
            commission = 0.05;
        }
        else if (salesamount < 10000) {
            commission = 0.02;
        }
        else {
            System.out.println("No commission");
        }
        double salescommission = (salesamount * commission);
        System.out.println("Sales ID: "  + salesid);
        System.out.println("Seller's Name: " + sellersname);
        System.out.println("Sales Amount: " + salesamount);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("Sales Percentage: " + (commission * 100) + "%");
        System.out.println("Sales Commission: " + salescommission);
    }
}
