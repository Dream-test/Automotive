public class Car {
   private String model;
   private int enginePower;
   private int mass;
   private CarType carType;

    public Car(String model, int enginePower, int mass, CarType carType) {
        this.model = model;
        this.enginePower = enginePower;
        this.mass = mass;
        this.carType = carType;
    }

    Engine engine = new Engine(enginePower);
    Rudder rudder = new Rudder();

    public void driveCar() {
        if (engine.isStarted()) {
            System.out.println("Yes, we run");
        } else {
            System.out.println("The first, please, start engine");
        }

    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return enginePower;
    }

    public int getMass() {
        return mass;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "Car: " +
                "model= '" + model + '\'' +
                ", enginePower= " + enginePower +
                ", mass= " + mass +
                ", carType= " + carType +
                ", rudderSize= " + rudder.getSize() +
                "sm";
    }
}
