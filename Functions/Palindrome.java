//check if a number is palindrome or not
package Functions;
import java.util.*;
public class Palindrome {
    public static boolean isPal(int num){
        int org = num;
        int rev = 0;
        while(num>0){
            int digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }return org == rev;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isPal(n)){
            System.out.println("Palindrome");

        }else{
            System.out.println("not a Palindrome");
        }
        
        sc.close();
    }
}
