package august.augex_04082024.ex_11082024.excar;

public class Tesla extends Car{
    @Override
    void speed() {
        System.out.println("Start the Tesla");
    }

    @Override
    void openTheCar() {
        System.out.println("Open the Tesla car");
    }

    @Override
    void gearBox() {
        System.out.println("Start the Tesla engine");
    }

    @Override
    void stop() {
        System.out.println("Stop the Tesla");
    }

    @Override
    void start() {
        System.out.println("Start the tesla");
    }

    void drive(){
        openTheCar();
        gearBox();
        start();
        stop();

    }
}
