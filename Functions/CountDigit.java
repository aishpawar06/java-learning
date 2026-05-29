//Write a function that calculates the number of digits in a number

import java.util.Scanner;
public class CountDigit {
    public static int count(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Count: "+ count(num));
        sc.close();
    }
    
}
