//Create a function to calculate the sum of digits of a number
package Functions;
import java.util.Scanner;
public class SumOfDigits {
    public static int SOD(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Sum is: "+ SOD(n));
    }
    
}
