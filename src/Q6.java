/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format

 */

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) { salary(); }

    public static void salary(){
    Scanner salaryslip = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
    int employeeid = salaryslip.nextInt();
        System.out.println("Enter Employee Name: ");
    String employeename = salaryslip.next();
        System.out.println("Enter Basic Salary: ");
    int basicsalary = salaryslip.nextInt();
    double hra = ((basicsalary * 10)/100);
    double da = ((basicsalary * 8)/100);
    double ta = ((basicsalary * 9)/100);
    double pf = ((basicsalary * 20)/100);
    double grosssalary = basicsalary + hra + ta + da - pf;
        System.out.println("HRA = " +hra);
        System.out.println("DA = " +da);
        System.out.println("TA = " +ta);
        System.out.println("PF = " +pf);
        System.out.println("Gross Salary = " +grosssalary);
        System.out.println("+-------------------------------+");
        System.out.println("|           SALARY SLIP         |");
        System.out.println("|-------------------------------|");
        System.out.println("| Basic Salary: " +basicsalary+"            |");
        System.out.println("| HRA 10% : " +hra +"               |");
        System.out.println("| TA 8% : " +ta+"                 |");
        System.out.println("| DA 9% : " +da+"                 |");
        System.out.println("| PF -20% : " +pf+"               |");
        System.out.println("|-------------------------------|");
        System.out.println("| Gross Salary :  " + grosssalary+"        |");
        System.out.println("+===============================+");
}
}
