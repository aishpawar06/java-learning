package Operators;
import java.util.Scanner;
public class Arthimatic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition is : "+(a+b));
        System.out.println("Subtraction is : "+(a-b));
        System.out.println("Multiplication is : "+(a*b));
        System.out.println("Division is : "+(a/b));
        System.out.println("Modulo is : "+(a%b));

        // Unary operators
        System.out.println("\nPre increment\n");
        int pre1 = 10;
        int pre2 = ++pre1;
        System.out.println(pre1);
        System.out.println(pre2);

        System.out.println("\nPost increment\n");
        int post1 = 10;
        int post2 = post1++;
        System.out.println(post1);
        System.out.println(post2);
    }
}
