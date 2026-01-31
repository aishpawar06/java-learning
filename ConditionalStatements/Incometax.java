//Income Tax Calculator
package ConditionalStatements;
import java.util.Scanner;

/*
    income < 5L
        0% Tax
    income between 5-10L
        20% Tax
    income > 10L
        30% Tax
 */

public class Incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Rupees: ");
        double income = sc.nextInt();
        double tax;
        if(income < 500000){
            System.out.println("You have to pay "+ (0*income)+ "Rs income tax");
        }else if(income >= 500000 && income < 1000000){
            System.out.println("You have to pay "+ (0.2*income)+"Rs income tax");
        }else{
            System.out.println("You have to pay "+ (0.3*income)+"Rs income tax");
        }
        sc.close();


    }
}
