package august.augex_04082024.ex_10082024.superThisKeyword;

public class Lab184 {

}
class student extends person{

    @Override
    void message() {
        System.out.println("I am a student message");

    }
    void display(){
        super.message();
    }
}
class person{
    void message(){
        System.out.println("I am a person message");
    }

}
