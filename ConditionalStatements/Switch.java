package ConditionalStatements;
import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println("Samosa");
                break;
            case 2 :System.out.println("Kachori");
                break;
            case 3: System.out.println("Tea");
                break;
            case 4: System.out.println("Coffee");
                break;
            default : System.out.println("Nothing available");
        }
    }
    
}
