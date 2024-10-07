package august.augex_04082024.ex_10082024.poly.methodOverriding;

public class Lab182 {
    public static void main(String[] args) {


        hound h1 = new hound();
        h1.bark();
        Dog d = new Dog();
        d.bark();
        Dog dog_ref = new hound();
        dog_ref.bark();
    }
}
