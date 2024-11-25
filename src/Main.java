import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Build new Car");
        Scanner in = new Scanner(System.in);

        System.out.println("What type of engine you want?");
        System.out.println("Enter 1 - for Combustion, 2 - for Electric");
        int typeEngine;
        while (true) {
            int typeInput = in.nextInt();
            if (typeInput >= 1 && typeInput <= 2) {
                typeEngine = typeInput;
                break;
            } else {
                System.out.println("Error: Please enter only numbers 1 or 2 or 3");
            }
        }
        Drivable currentCar;

        in.nextLine();
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

        if (typeEngine == 1) {
            currentCar = new CombustionCar(modelInput, enginePowerInput, massInput, newCarType);
        } else {
            System.out.println("Enter the size of steering wheel (sm)");
            int newRudderSize = in.nextInt();
            currentCar =new ElectricCar(modelInput, enginePowerInput, massInput, newCarType, newRudderSize);

        }

        in.close();
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

    public static void currentCarDrive(Drivable currentCar) {
        System.out.println(currentCar);
        currentCar.driveCar();
    }
}