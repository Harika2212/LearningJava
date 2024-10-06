package aug_04082024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p1 = new ATBPerson();
        Person p2 = new Person();
       p1.learn();

       ATBPerson P1 = new ATBPerson("Harika");
       ATBPerson P2 = new ATBPerson("Mullagura");
       ATBPerson P3 = new ATBPerson("Tillu",123456789);


        System.out.println(P1.name);
        System.out.println(P2.name);
        System.out.println(P3.name);
        System.out.println(P3.phone);




    }

}
