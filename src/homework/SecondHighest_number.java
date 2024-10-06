package homework;

public class SecondHighest_number {
    public static void main(String[] args) {
        int[] SH = {10,20,30,40,12,88,44};
        int HN = 1;
        int SHN = -1;
        for(int i =0;i<SH.length;i++) {
            if (SH[i] > HN) {
                HN = SH[i];

            }

        }
        for(int j =0;j<SH.length;j++) {
            if (SH[j] > SHN && SHN!=HN) {
                SHN = SH[j];

            }

        }
            System.out.println("Highest Number is " + HN);
            System.out.println("Second Highest Number is " + SHN);

    }

}
