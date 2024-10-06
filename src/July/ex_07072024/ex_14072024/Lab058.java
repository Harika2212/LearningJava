package July.ex_07072024.ex_14072024;

public class Lab058 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.458f;
        //int sum = course+GST; - invalid implicit casting
        float sum = course+GST;  // Result should always be stored in bigger basket
        System.out.println(sum);

    }
}
