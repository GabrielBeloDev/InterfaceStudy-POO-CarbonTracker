package Controller;

import Model.Bicycle;
import Model.Building;
import Model.Car;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Building building = new Building(100, "gas");
        Car car = new Car("gasolina", 50);
        Bicycle bicycle = new Bicycle("aço");

        controller.addObject(building);
        controller.addObject(car);
        controller.addObject(bicycle);

        controller.displayCarbonFootprints();
    }
}
