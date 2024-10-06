package aug_04082024;

import java.util.Scanner;

public class Lab170 {

    public static void main(String[] args) {


        BankAccount A1 = new BankAccount();
//        System.out.println(A1.BankName);
//        System.out.println(A1.Balance);
//        System.out.println(A1.BankCode);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bank Name");
        String bName = sc.next();
        System.out.println("Enter your Bank Balance");
        int bal = sc.nextInt();
        System.out.println("Enter the Bank Code");
        String bCode = sc.next();



        BankAccount B1 = new BankAccount(bName,bal,bCode);
         B1.PrintDetails();
         sc.close();

    }
}
