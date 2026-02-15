//Create a method which accepts a number and returns true if its even otherwise false
package Functions;
import java.util.Scanner;
public class IsEven {
    public static boolean IsEvenFunc(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(IsEvenFunc(n));
    }
    
}
