package Problems;
import java.util.*;
public class Calculator {
    void add(int a , int b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    void sub(int a , int b){
        System.out.println(a+" - "+b+" = "+(a-b));
    }
    void mult(int a, int b){
        System.out.println(a+" * "+b+" = "+(a*b));
    }
    void div( int a , int b){
        System.out.println(a+" / "+b+" = "+(a/b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select Option: \n 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide\n");
        int ch = sc.nextInt();
        if(ch==1){
            c.add(a,b);
        }else if(ch == 2){
            c.sub(a,b);
        }else if(ch == 3){
            c.mult(a,b);
        }else if(ch==4){
            c.div(a,b);
        }else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
