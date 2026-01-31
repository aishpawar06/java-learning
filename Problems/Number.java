package Problems;
import java.util.Scanner;
public class Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        num=Math.abs(num);
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        System.out.println("Sum of digits "+original+" is : "+ sum);
        sc.close();
    }
    
}
