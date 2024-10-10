package august.augex_04082024.ex_11082024.excar;

public class WagonR extends Car{
   void driveWR(){
       openTheCar();
       gearBox();
       start();
       stop();
    }

    public static void main(String[] args) {
        WagonR WR = new WagonR();
        WR.driveWR();
    }
}
