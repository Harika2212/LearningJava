package ex_14072024;

public class Lab060 {
    public static void main(String[] args) {
        //Increment or Decrement operator
        // Pre and Post

        // pre increment - '++' is the operator
        // value is incremented first and then stored in the result
        int a = 10;
        int b = ++a; // ++a= a+1
        System.out.println(a);
        System.out.println(b);

        //Post Increment
        // Value is stored in the result first and then incremented
        int a1 = 10;
        int b1 = a++; // a++= a+1
        System.out.println(a1);
        System.out.println(b1);

    }
}
