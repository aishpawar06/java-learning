package Patterns;

public class SolidRhombus {
    public static void main(String args[]){
        int n=8;
        for(int i=1;i<=n;i++){
            //spaces
            for(int a=1;a<=n-i;a++){
                System.out.print("  ");
            }
            //Star
            for(int b=1;b<=n;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
