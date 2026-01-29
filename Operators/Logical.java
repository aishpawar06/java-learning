package Operators;

public class Logical {
    public static void main(String args[]){
        // Logical AND (only returns true if both operands are true)
        System.out.println("Logical AND");
        System.out.println( (5>2) && (2>0) );   // T && T
        System.out.println( (5<1) && (5>4) );   // F && T

        //Logical OR (only returns false if both operands are false)
        System.out.println("\nLogical OR");
        System.out.println( (5>7) || (7<1) );   // F || F
        System.out.println( (5>3) || (7>10) );  // T || F

        //Logical NOT (Reverses the answer)
        System.out.println("\nLogical NOT");
        System.out.println(!true);              // !T
    }
}
