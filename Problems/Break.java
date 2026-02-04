package Problems;
import java.util.*;
public class Break {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
            System.out.println("Enter  a number: ");
            num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }
        sc.close();
    }
}
