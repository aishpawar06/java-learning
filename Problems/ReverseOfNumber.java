package Problems;
import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp=num;
        while(temp>0){
            System.out.print(temp%10);
            temp/=10;
        }
        
    }
    
}
