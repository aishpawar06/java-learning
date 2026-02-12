package Patterns;

public class Floyds {
    public static void main(String args[]){

        int f=1;
        for(int i=0; i<5; i++){
            for(int j=0; j<=i;j++){
                System.out.print(f + " ");
                f++;
            }System.out.println();
        }
    }
}
