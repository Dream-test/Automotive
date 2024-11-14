import java.util.Scanner;

public class Main {
    private static String newModel;
    private static int newEnginePower;
    private static int newMass;
    private static CarType newCarType;
    public static void main(String[] args) {
        System.out.println("Build new Car");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the model name of new Car");
        String modelInput = in.nextLine();
        setNewModel(modelInput);

        System.out.println("Enter the type of car");
        System.out.println("Enter 1 - for Sedan, 2 - for GT, 3 - for AllRoad");

        while (true) {
            int typeInput = in.nextInt();
            if (typeInput >= 1 && typeInput <= 3) {
                setCarType(typeInput);
                break;
            } else {
                System.out.println("Error: Please enter only numbers 1 or 2 or 3");
            }
        }

        System.out.println("Enter the power of engine (kW)");
        int enginePowerInput = in.nextInt();
        setNewEnginePower(enginePowerInput);

        System.out.println("Enter the mass of the car (kg)");
        int massInput = in.nextInt();
        setNewMass(massInput);

        Car currentCar = new Car(newModel, newEnginePower, newMass, newCarType);
        String currentCarData = currentCar.toString();
        System.out.println("Created new " + currentCarData);

    }

    public static void setCarType(int input) {
        if (input == 1) {
            newCarType = CarType.SEDAN;
        } else if (input == 2) {
            newCarType = CarType.GT;
        } else if (input == 3) {
            newCarType = CarType.PICK_UP;
        } else {
            throw new RuntimeException("Wrong number of CarType");
        }
    }

    public static void setNewModel(String input) {
        newModel = input;
    }

    public static void setNewEnginePower(int input) {
        newEnginePower = input;
    }

    public static void setNewMass(int input) {
        newMass = input;
    }





}