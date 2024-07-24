package homework;

import java.util.Scanner;

public class triangl_20072024 {
    public static void main(String[] args) {
        //Triangle classifier

        Scanner sc = new Scanner(System.in);
        System.out.println("Length of side1");
        int s1 = sc.nextInt();

        System.out.println("Length of side2");
        int s2 = sc.nextInt();

        System.out.println("Length of side3");
        int s3 = sc.nextInt();

        if(s1==s2 && s1==s3){
            System.out.println("Equilateral Triangle");
        }else if(s1==s2 || s2==s3 ||s1==s3) {
            System.out.println("Isosceles Triangle");
        }else if(s1!=s2 && s2!=s3){
            System.out.println("Scalene Triangle");
        }else {
            System.out.println("No triangle");
        }

    }
}
