//Find the factorial of a number
package Functions;

public class Factorial {
    public static int factorial(int n){
        int fact=1;
        if(n==0){
            return 1;
        }
        else{

            while(n>0){
                fact*=n;
                n--;
            }
        }
        return fact;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println(n+" !"+ " = "+ factorial(n));
    }
    
}
