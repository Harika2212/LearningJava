package ex_27072024;

public class Lab142 {
    public static void main(String[] args) {

        final int[] ages = new int[5];
        ages[3]=100;
        System.out.println(ages[3]);

        //in line number 6, final keyword finalized the length of the array but not the values

        final int a = 10;
        //int a = 30; -cannot change the value which is finalized

    }
}
