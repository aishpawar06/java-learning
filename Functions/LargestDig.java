//Create a function which returns the largest digit in a number
package Functions;
import java.util.Scanner;
public class LargestDig {
    public static int largestDigit(int num){
        int largest=0;
        while(num>0){
            int rem=num%10;
            if(rem>largest){
                largest=rem;
            }
            num/=10;
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Largest digit is : "+ largestDigit(num));
    }
    
}
