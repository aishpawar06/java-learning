package Operators;

public class Assignment {
    public static void main(String args[]){
        int a = 10;
        System.out.println("\n=");
        int b = a;
        System.out.println("b= "+b);

        System.out.println("\n+=");
        b+=a;
        System.out.println(b);

        System.out.println("\n-=");
        b-=a;
        System.out.println(b);

        System.out.println("\n*=");
        b*=a;
        System.out.println(b);

        System.out.println("\n/=");
        b/=a;
        System.out.println(b);
        
        System.out.println("\n%=");
        b%=a;
        System.out.println(b);


    }
}
