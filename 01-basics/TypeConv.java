public class TypeConv {
    public static void main(String args[]){
        //Destination type > Source type
        // Implicit/Widening
        int a= 25;
        float  b = a;
        double c = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //Explicit/Narrowing
        float f = 25.34f;
        int i = (int)f;
        System.out.println(f);
        System.out.println(i);

    }
}
