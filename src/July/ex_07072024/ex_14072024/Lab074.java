package July.ex_07072024.ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String S1 = "java";
        String S2 = "java";
        //2
        String S3 = new String("Java");
        String S4 = new String("Java");
        //2
        boolean b = S1 == S2; //Checks for ref or location
        System.out.println(b); // checks for content
        System.out.println(S3.equals(S4));
    }

}
