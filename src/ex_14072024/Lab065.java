package ex_14072024;

public class Lab065 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //A = ++a , A=11, a=11
        //B= a++, B= 11, a=12
        //C= a++ , C = 12 a = 13

    }
}