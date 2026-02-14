//Create a Diamond pattern using star
package Patterns;

public class Diamond {
    public static void main(String args[]){
        int n=15;
        //Upper triangle
        for(int i=1;i<=n;i++){
            
            for(int a=1;a<=n-i;a++){            //Spaces
                System.out.print(" ");
            }

            for(int a=1;a<=(2*i)-1;a++){        //Stars
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Triangle
        for(int i=n;i>=1;i--){
            
            for(int a=1;a<=n-i;a++){            //Spaces
                System.out.print(" ");
            }

            for(int a=1;a<=(2*i)-1;a++){        //Stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
