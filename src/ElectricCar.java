public class ElectricCar extends Car implements Drivable {
    public ElectricCar(String model, int enginePower, int mass, CarType carType, int rudderSize) {
        super(model, enginePower, mass, carType);
        getRudder().setSize(rudderSize);
    }

    public void driveCar() {
            System.out.println("Yes, we run");
            getRudder().turnRight();
            getRudder().turnLeft();
    }

    public void carStartEngine() {}

    public void carStopEngine() {}

    /* public void driveCar() {
        if (engine.isStarted()) {
            System.out.println("Yes, we run");
        } else {
            System.out.println("The first, please, start engine");
        }
    }
    */


}
