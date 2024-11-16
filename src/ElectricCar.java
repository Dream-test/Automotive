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

    @Override
    public String toString() {
        return "Electric Car: " +
                "model= '" + getModel() + '\'' +
                ", enginePower= " + getEnginePower() +
                ", mass= " + getMass() +
                ", carType= " + getCarType() +
                ", rudderSize= " + getRudder().getSize() +
                "sm";
    }
}
