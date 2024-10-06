package aug_04082024;

public class ATBPerson {
    String name;
    long phone;

     ATBPerson() {
        System.out.println("New object is created");
    }
    void learn(){
        System.out.println("Learning Automation");
    }
    ATBPerson(String nameGiven){
            this.name = nameGiven;
    }
    ATBPerson(String nameGiven,long phoneNumber){
        this.name = nameGiven;
        this.phone = phoneNumber;

    }

    }



