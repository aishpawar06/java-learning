//Create a hollow Rhombus Pattern using stars
package Patterns;

public class HollowRhombus {
    public static void main(String args[]){
        int n=8;
        for(int i=1;i<=n;i++){
            //spaces
            for(int a=1;a<=n-i;a++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==n||j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
