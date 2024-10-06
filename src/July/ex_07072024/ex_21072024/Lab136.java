package July.ex_07072024.ex_21072024;

public class Lab136 {
    public static void main(String[] args) {
        //Types of functions
        //Functions without parameters and without return type
        function_type1();
        //Functions without parameters and with return type
        String name = function_type2();
        System.out.println(name);
        //Functions with parameters and without return type
        function_type3("Moksh");
        //Functions with parameters and with return type
        int name1 = function_type4(4,5);
        System.out.println("Sum value is " +name1);

    }

    static void function_type1() {
        System.out.println("without parameters and without return type");
    }

    static String function_type2() {
        System.out.println("without parameters and with return type");
        return "Harika";
    }

    static void function_type3(String name) {
        System.out.println("with parameters and without return type");
        System.out.println("My name is " + name);
    }

    static int function_type4(int a,int b) {
        System.out.println("with parameters and with return type");
        return a+b;
    }
}



