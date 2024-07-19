package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        //Type casting - Source and destination conversion
        //Widening - Implicit, Explicit - lossless
        byte b = 10;
        char c = 'B';
        int d = b; // Valid - implicit casting
        int d1 = (int)b; //Valid - Explicit casting

        //Narrowing - Implicit, Explicit(with data type) - data loss
        int b1 = 200;
       // byte b2 = b1 //Invalid Implicit casting
        byte b2 = (byte)b1; // Invalid Explicit casting - data loss

    }
}
