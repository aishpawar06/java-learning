package Operators;
import java.util.*;
public class Ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println((num%2==0)?"Even":"Odd");
    }
    
}
