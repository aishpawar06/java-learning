//write a program to take numbers from user and calculate sum of even and odd numbers seperately
package Functions;
import java.util.Scanner;
public class EveOddSum {
    public static void EveOdd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Total numbers you are going to enter are: ");
        int n=sc.nextInt();
        int a,EveSum=0,OddSum=0;
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            if(a%2==0){
                EveSum+=a;
            }else{
                OddSum+=a;
            }

        }
        System.out.println("Sum of even numbers: "+EveSum);
        System.out.println("Sum of odd numbers: "+OddSum);
        sc.close();
    }
    public static void main(String args[]){
        EveOdd();

    }
    
}
