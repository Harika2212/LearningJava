package ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        //multiple conditions can be handled in switch case

        int a = 010;
        switch (a){
            case 001,002,003 ->System.out.println("Number matched");

            default -> System.out.println("Not matching");

        }
    }
}
