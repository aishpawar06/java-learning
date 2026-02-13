//Create a butterfly pattern using stars
package Patterns;

public class Butterfly {
    public static void main(String args[]){
        int n=4;
        //Upper Triangle
        for(int i=1;i<=4;i++){
            //star 1
            for(int a=1;a<=i;a++){
                System.out.print("*");
            }
            //spaces
            for(int b=1; b<=2*(n-i);b++){
                System.out.print(" ");
            }
            //star 2
            for(int d=1;d<=i;d++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower triangle
        for(int i=n;i>0;i--){
             //star 1
            for(int a=1;a<=i;a++){
                System.out.print("*");
            }
            //spaces
            for(int b=1; b<=2*(n-i);b++){
                System.out.print(" ");
            }
            //star 2
            for(int d=1;d<=i;d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
