package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        //break is not needed if we use arrow in switch case
        //case 1 -> System.out.println("number");
        int a = 010;
        switch (a) {
            case 001, 002, 003, 004, 010 -> System.out.println("Number matched");

            default -> System.out.println("Not matching");
        }
    }
}
