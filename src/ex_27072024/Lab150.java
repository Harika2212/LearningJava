package ex_27072024;

public class Lab150 {
    public static void main(String[] args) {

        int[][] array2d = {
                {23,34},
                {99,54},
                {33,66}
        };

        int row = array2d.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]);
                System.out.print('\t');

            }
            System.out.println();

        }
    }
}
