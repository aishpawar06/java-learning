//Create an inverted right angled triangle pattern
package Patterns;

public class invert {
    public static void main(String args[]){
        for(int i=0; i<5;i++){
            //for spaces
            for(int j =0; j<5-i;j++){
                System.out.print(" ");
            }
            //for star
            for(int k =0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
