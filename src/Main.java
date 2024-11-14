import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Build new Car");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the model name of new Car");
        String modelInput = in.nextLine();

        System.out.println("Enter the type of car");
        System.out.println("Enter 1 - for Sedan, 2 - for GT, 3 - for AllRoad");

        CarType newCarType;
        while (true) {
            int typeInput = in.nextInt();
            if (typeInput >= 1 && typeInput <= 3) {
                newCarType = setCarType(typeInput);
                break;
            } else {
                System.out.println("Error: Please enter only numbers 1 or 2 or 3");
            }
        }

        System.out.println("Enter the power of engine (kW)");
        int enginePowerInput = in.nextInt();

        System.out.println("Enter the mass of the car (kg)");
        int massInput = in.nextInt();

        Car currentCar = new Car(modelInput, enginePowerInput, massInput, newCarType);
        //System.out.println("Created new " + currentCar);

        currentCarDrive(currentCar);

    }

    public static CarType setCarType(int input) {
        return switch (input) {
            case 1 -> CarType.SEDAN;
            case 2 -> CarType.GT;
            case 3 -> CarType.PICK_UP;
            default -> throw new RuntimeException("Wrong number of CarType");
        };
    }

    public static void currentCarDrive(Car currentCar) {
        System.out.println(currentCar);
        currentCar.getEngine().startEngine();
        currentCar.driveCar();
        currentCar.getRudder().turnLeft();
        currentCar.getRudder().turnRight();
        currentCar.getEngine().stopEngine();
    }
}