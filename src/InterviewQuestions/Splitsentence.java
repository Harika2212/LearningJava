package InterviewQuestions;

import java.util.Scanner;

public class Splitsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String S1 = sc.nextLine();

        String[] words = S1.split("");
        sc.close();

    }
}
