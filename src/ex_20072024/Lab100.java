package ex_20072024;

public class Lab100 {
    public static void main(String[] args) throws IllegalAccessException {
        //Switch can return value using yield
        // yield means return in future

        char c = 'A';
        int val = switch (c){
            case 'A':
                yield 65;

            default:
                throw new IllegalAccessException("unexpected value:" +c);

        };
        System.out.println(val);
    }
}
