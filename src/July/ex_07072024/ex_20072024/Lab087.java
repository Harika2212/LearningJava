package July.ex_07072024.ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take user input and check if number is even or odd
        Scanner sc = new Scanner(System.in); //creation of object for the scanner class
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

        if(num%2==0){
            System.out.println("Num is Even");
        }else {
            System.out.println("Num is Odd");
        }


    }
}