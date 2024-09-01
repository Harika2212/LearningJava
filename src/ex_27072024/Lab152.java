package ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        //Strings are immutable in nature
        //StringBuilder, StringBuffer

        //StringBuilder - it is not synchronized and so it is faster
        //StringBuffer - It is synchronized which is done one by one
        // and hence its performance is slower
        //Mostly we prefer StringBuilder because of fast performance,it is not thread safe

            String s1 = new String("Ram");
            String S1 = "Harika";

            StringBuffer SB = new StringBuffer("Dharma");
            SB.append("Teja");
            SB.append("Sariputi");

        System.out.println(SB);

        StringBuilder SB1 = new StringBuilder("Sariputi");
        SB1.append("Mokshagna");
        SB1.append("Ram");

        System.out.println(SB1);

    }
}
