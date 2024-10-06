package InterviewQuestions;
import java.util.Scanner;
public class printnumberofwordsinasentence {
    public static void main(String[] args) {



                // Create a Scanner object for input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user for a sentence
                System.out.println("Enter a sentence:");
                String sentence = scanner.nextLine();

                // Split the sentence into words
                String[] words = sentence.split(" ");

                // Print the header for the table
                System.out.printf("%-15s %s%n", "Word", "Length");
                System.out.println("---------------------");

                // Iterate through each word and print it along with its length
                for (String word : words) {
                    System.out.printf(word, word.length());
                }

                // Close the scanner
                scanner.close();
            }
        }


