//Program which prints table of any number using while loop
package loops;
import java.util.Scanner;
public class WhileLoop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int multplr = 1;
        while(multplr<=10){
            System.out.println(num+ " x " +multplr+ " = " +(num*multplr));
            multplr++;
        }
        sc.close();
    }
}