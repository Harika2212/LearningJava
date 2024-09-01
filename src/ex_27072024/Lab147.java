package ex_27072024;

import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {

        int[] salaries = {20,30,40,12,19,44};
        int max = 1;
        int min = salaries[0];
        for (int i = 0; i < salaries.length ; i++) {
            if(salaries[i]>max){
                max=salaries[i];
            }
            if(min>salaries[i]){
                min = salaries[i];
            }

        }
        System.out.println("Maximum number is "   +max);
        System.out.println("Minimum number is "   +min);

//        Arrays.sort(salaries);
//        System.out.println(salaries[salaries.length-1]);
    }
}
