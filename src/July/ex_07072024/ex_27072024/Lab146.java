package July.ex_07072024.ex_27072024;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {

        //where we take user input of the five subjects
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the marks ...");

        for (int i = 0; i < marks.length ; i++) {
            marks[i] = sc.nextInt();
            System.out.println("Enter the marks ..." + marks[i]);
        }

        int avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("avg is..." +avg);

sc.close();

    }
}
