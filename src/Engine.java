public class Engine {
    private int enginePower;
    private boolean isStarted = false;


    public Engine(int enginePower) {
        this.enginePower = enginePower;
    }

    public void startEngine() {
        if (!isStarted) {
            System.out.println("Engine " + enginePower + "PS is started");
            isStarted = true;
        } else {
            System.out.println("Hrrrr..., the engine has already started");
        }
    }

    public void stopEngine() {
        if (isStarted) {
            System.out.println("Engine " + enginePower + "PS is stopped");
            isStarted = false;
        } else {
            System.out.println("Engine isn't started");
        }
    }

    public boolean isStarted() {
        return isStarted;
    }

    public int getEnginePower() {
        return enginePower;
    }
}
