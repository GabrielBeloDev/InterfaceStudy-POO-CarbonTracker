package Controller;

import Model.Bicycle;
import Model.Building;
import Model.Car;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Building building = new Building(100, "gas",30);
        Car car = new Car("gasolina", 50,25);
        Bicycle bicycle = new Bicycle("aço", 5);

        controller.addObject(building);
        controller.addObject(car);
        controller.addObject(bicycle);

        controller.ordenarCarbonFootprints();

        controller.displayCarbonFootprints();

    }
}