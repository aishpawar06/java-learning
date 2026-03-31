import java.util.Scanner;
public class Armstrong {
    public static int count(int num){
        if(num==0){return 1;}
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }

    public static int power(int base, int exp){
        int mult = 1;
        while(exp>0){
            mult = mult*base;
            exp--;
        }
        return mult;

    }

    public static boolean Check(int num){
        int org = num;
        int sum = 0;
        int digits = count(num);
        while(num>0){
            sum+=power(num%10,digits);
            num/=10;
        }
        if(org==sum){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(Check(n)){
            System.out.println(n + " is an Armstrong number.");
        }else{
            System.out.println(n + " is not an Armstrong number.");
        }
        sc.close();
    }
}
