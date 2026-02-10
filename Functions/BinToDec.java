//convert a binary number to decimal number
package Functions;
import java.util.*;

public class BinToDec{
    public static void B2D(int n){
        int pow =0;
        int decNum=0;
        while(n>0){
            int rem=n%10;
            decNum = decNum+(rem*(int)Math.pow(2,pow));
            pow++;
            n= n/10;
        }
        System.out.println(decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int bin = sc.nextInt();
        B2D(bin);
    }
}