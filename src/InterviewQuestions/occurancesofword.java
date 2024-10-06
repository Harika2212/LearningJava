package InterviewQuestions;

import java.util.Scanner;

public class occurancesofword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String S1 = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Word");
        String S2 = sc2.nextLine();
    }

        static int countOccurrences (String S1, String S2){

            String S3[] = S1.split("");

            int count = 0;
            for (int i = 0; i < S3.length; i++) {
                if (S2.equals(S3[i]))
                    count++;
            }
            return count;


        }
    }








