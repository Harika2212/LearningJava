package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //max number in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();


        System.out.println("Enter the num2");
        int num2 = sc.nextInt();

        /*//Method1
        int res = Math.max(num1,num2);
        System.out.println("The maximum number is " +res);
*/
        //Method2
        /*if(num1>num2){
            System.out.println("The num1 is max");
        }else{
            System.out.println("The num2 is max");*/

        //Method3 if bth the numbers are equal
        if(num1>num2){
            System.out.println("The num1 is max");
        }else if(num2>num1){
            System.out.println("The num2 is max");
            }else{
            System.out.println("Both the numbers are equal");

        }
        }
    }

