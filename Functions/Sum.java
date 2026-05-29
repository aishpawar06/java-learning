// Write a function to calculate the sum of digits of an integer

import java.util.Scanner;
public class Sum {
    public static int add(int num){
        int sum=0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Sum is : "+add(num));
        sc.close();
    }
    
}
