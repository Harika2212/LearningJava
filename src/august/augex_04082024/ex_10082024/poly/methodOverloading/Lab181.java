package august.augex_04082024.ex_10082024.poly.methodOverloading;

public class Lab181 {
    //Polymorphism - many forms

    public static void main(String[] args) {
        mathClass mc = new mathClass();
        int res = mc.add(12,30);
        System.out.println(res);

        double res1 = mc.add(23.2,34.9);
        System.out.println(res1);

        String res2 = mc.add("Harika","Mullagura");
        System.out.println(res2);

    }



}
