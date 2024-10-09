package august.augex_04082024.ex_10082024.superThisKeyword;

public class Lab183 {
    public static void main(String[] args) {
        car c = new car();
        c.display();
    }
}



class car extends vehicle {
    private int maxSpeed = 281;

    car(){
        super(20); //constructor chaining
        System.out.println("DC Car");
    }

    void display() {
        System.out.println("Car speed is " + this.maxSpeed);
        System.out.println("Vehicle speed is " + super.maxSpeed);
        super.message();
        this.message();
    }
    @Override
    void message(){
        System.out.println("Hello world1");
    }
}


    class vehicle {
        public int maxSpeed = 180;
        vehicle(){
            System.out.println("DC Vehicle");
        }
        vehicle(int a){
            System.out.println("PC Vehicle");
        }
        void message(){
            System.out.println("Hello world");
        }
        void message(int a){
            System.out.println("Hello universe");
        }
    }
