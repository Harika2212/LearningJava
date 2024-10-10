package august.augex_04082024.ex_11082024.excar;

public class TataFacelift extends Engine{
    @Override
    void start() {
        System.out.println("Start the TataFacelift");
    }

    @Override
    void stop() {
        System.out.println("Stop the TataFacelift");
    }

    @Override
    void speed() {
        System.out.println("Speed is 180KM/HR");
    }

    @Override
    void gearBox() {
        System.out.println("EV");
    }

    @Override
    void openTheCar() {
        System.out.println("Open TataFacelift");
    }

    void driveTF(){
        openTheCar();
        gearBox();
        start();
        stop();

    }

}
