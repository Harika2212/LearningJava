package august.augex_04082024.ex_10082024.superThisKeyword;

import august.augex_04082024.hierarichalInheritance.Harika;

public class Lab185 {

}
class person1{
    public person1() {
        System.out.println("Person1 - DC");
    }
    public person1(String a) {
        System.out.println("Person2 - PC A1");
    }
    public person1(String a,String b) {
        System.out.println("Person3 - PC A2");
    }
}
class student1 extends person1{
    student1(String a) {
        System.out.println("PC Student1");
    }

     student1() {
        //super("Harika");
         this("Harika");

    }
}
