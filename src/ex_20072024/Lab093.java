package ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        //Which browser we want to run in web automation

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser which you want to start with ...");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the Chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the Firefox browser");
                break;
            case "safari":
                System.out.println("Starting the Safari browser");
                break;
            case "edge":
                System.out.println("Starting the Edge browser");
                break;
            default:
                System.out.println("No idea about the browser");
                break;


        }
    }
}
