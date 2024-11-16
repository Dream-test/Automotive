public class CombustionCar extends Car implements Drivable {
    public CombustionCar(String model, int enginePower, int mass, CarType carType) {
        super(model, enginePower, mass, carType);
    }

    public void carStartEngine() {
        getEngine().startEngine();
    }

    public void carStopEngine() {
        getEngine().stopEngine();
    }
}
