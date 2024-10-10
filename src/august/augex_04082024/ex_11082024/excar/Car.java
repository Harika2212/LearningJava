package august.augex_04082024.ex_11082024.excar;

 class Car extends Engine {
    //Engine
    //gearBox
    //Keys
    //Tyres
    //Tesla is a type of Car
    //Tesla - drive()


     @Override
     void speed() {
         System.out.println("150KM/HR");
     }


     @Override
    void openTheCar() {
        System.out.println("Open the car with keys");
    }

    @Override
    void gearBox() {
        System.out.println("start the engine");

    }

    @Override
    void stop() {
        System.out.println("stop the car");
    }

    @Override
    void start() {
        System.out.println("Start the car");

    }
}
