//Take 3 input from users as cost and add them to get the bill and also add 18% gst tax to the items in bill
import java.util.*;
public class Question {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil:");
        float item1 = sc.nextFloat();
        System.out.println("Enter the price of pen: ");
        float item2 = sc.nextFloat();
        System.out.println("Enter the price of eraser: ");
        float item3 = sc.nextFloat();
        float bill = (item1+item2+item3)+(0.18f*(item1+item2+item3));
        System.out.println("Bill after 18% gst is : "+ bill);
    }
    
}
