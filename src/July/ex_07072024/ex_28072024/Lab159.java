package July.ex_07072024.ex_28072024;

import java.util.Scanner;

public class Lab159 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        Bank Bank1 = new Bank();
        Bank Bank2 = new Bank();



        Bank1.Name = "SBI";
        Bank2.Name = "ICICI";
        Bank1.balance = 100000;
        Bank2.balance = 1000000;

        System.out.println(Bank1.Name);
        System.out.println(Bank1.balance);
        System.out.println(Bank2.Name);
        System.out.println(Bank2.balance);

    }
}
