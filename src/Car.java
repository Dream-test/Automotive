public abstract class Car {
   private final String model;
   private final int enginePower;
   private final int mass;
   private final CarType carType;
   private final Engine engine;
   private final Rudder rudder = new Rudder();

    public Car(String model, int enginePower, int mass, CarType carType) {
        this.model = model;
        this.enginePower = enginePower;
        this.mass = mass;
        this.carType = carType;
        this.engine = new Engine(enginePower);
    }

    public void driveCar() {
        if (engine.isStarted()) {
            System.out.println("Yes, we run");
            getRudder().turnLeft();
            getRudder().turnRight();
        } else {
            System.out.println("The first, please, start engine");
        }
    }

    public String getModel() {
        return model;
    }

    public int getMass() {
        return mass;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public Engine getEngine() {
        return engine;
    }

    public Rudder getRudder() {
        return rudder;
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
