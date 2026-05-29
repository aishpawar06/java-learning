
import java.util.Scanner;
public class Fact {
    public static int factorial(int num){
        int f = 1;
        if(num<0){System.out.println("factorial for -ve number does not exists!");
            return 0;
        }
        while(num>0){
            f*=num;
            num--;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial: "+ factorial(n));
        sc.close();
    }
}
