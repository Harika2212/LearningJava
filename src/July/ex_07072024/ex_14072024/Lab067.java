package July.ex_07072024.ex_14072024;

import java.sql.SQLOutput;

public class Lab067 {
    public static void main(String[] args) {
        String S1 = "Harika";
        String S2 = "Moksh";
        String S3 = new String("Dharma");
        System.out.println(S3);

        System.out.println(S1.toLowerCase());
        // 2 ways to create string and those strings have different memory locations
        // one stores the value in SCP(String constant pool)
        // new operator strings stores in Heap memory

        String S4 = "Harika";
        System.out.println(S4);
        String S7 = "Mullagura";
        System.out.println(S7);

        String S8 = "Sariputi";
        System.out.println(S8);

        System.out.println(S4);

        String S5 = new String("Akhil");
        System.out.println(S5);
        String S6 = new String("Tillu");
        System.out.println(S6);


    }
}
