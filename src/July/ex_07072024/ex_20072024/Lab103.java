package July.ex_07072024.ex_20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //program to check number is positive/negative/zer

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 =sc.nextInt();

        if(num1>0) {
            System.out.println("Positive");
        }else if(num1<0){
                System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
