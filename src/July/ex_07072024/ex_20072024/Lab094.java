package July.ex_07072024.ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        // Take a user input as Char and tell the user if it is a vowel or not
        //a,e,i,o,u

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character..");
        char vowel = sc.next().charAt(0);

        switch (vowel){
            case 'a':
                System.out.println("The given character is a vowel");
                break;
            case 'e':
                System.out.println("The given character is a vowel");
                break;
            case 'i':
                System.out.println("The given character is a vowel");
                break;
            case 'o':
                System.out.println("The given character is a vowel");
                break;
            case 'u':
                System.out.println("The given character is a vowel");
                break;
            default:
                System.out.println("Not an vowel");
                break;
                }
    }
}
