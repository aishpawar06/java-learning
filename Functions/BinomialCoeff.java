//Find the Binomial Coefficient

public class BinomialCoeff {
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
    public static int Binomial(int n, int r){
        int BinCoeff = (factorial(n)/(factorial(r)*factorial(n-r)));
        return BinCoeff;
    }
    public static void main(String args[]){
        System.out.println(Binomial(10,2));
    }
}
