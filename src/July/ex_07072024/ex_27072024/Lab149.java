package July.ex_07072024.ex_27072024;

public class Lab149 {
    public static void main(String[] args) {

        int[][] array2d = {
                {23,34,45},
                {11,22,33},
                {99,18,17}
        };

        for (int i = 0; i < array2d.length ; i++) {
            for (int j = 0; j <array2d[i].length ; j++) {
                System.out.print(array2d[i][j]);
                System.out.print("\t");
                
            }
            System.out.println();
            
        }
    }
}
