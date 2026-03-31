import java.util.Scanner;
public class StrongNum {
    public static int fact(int n){
        int fact = 1;
        for(int i = n; i>0; i--){
            fact*=i;
        }
        return fact;
    }

    public static boolean strong(int num){
        int org = num;
        int sum= 0;
        while(num>0){
            sum+=fact(num%10);
            num/=10;
        }
        if(sum == org){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num  = sc.nextInt();
        if(strong(num)){
            System.out.println(num+" is strong number.");
        }
        else{
            System.out.println(num+ " is not a strong number");
        }
    }
}
