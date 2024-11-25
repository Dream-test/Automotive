public class CombustionCar extends Car implements Drivable {
    public CombustionCar(String model, int enginePower, int mass, CarType carType) {
        super(model, enginePower, mass, carType);
    }

    public void driveCar() {
        getEngine().startEngine();
        if (getEngine().isStarted()) {
            System.out.println("Yes, we run");
            getRudder().turnLeft();
            getRudder().turnRight();
            getEngine().stopEngine();
        } else {
            System.out.println("The first, please, start engine");
        }
    }

    @Override
    public String toString() {
        return "Combustion Car: " +
                "model= '" + getModel() + '\'' +
                ", enginePower= " + getEnginePower() +
                ", mass= " + getMass() +
                ", carType= " + getCarType() +
                ", rudderSize= " + getRudder().getSize() +
                "sm";
    }
}
