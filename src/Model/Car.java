package Model;

public class Car implements CarbonFootprint {
    private String fueltype;

    private double consumido;

    public Car(String fueltype, double consumido) {
        this.fueltype = fueltype;
        this.consumido = consumido;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public double getConsumido() {
        return consumido;
    }

    public void setConsumido(double consumido) {
        this.consumido = consumido;
    }

    @Override
    public double getCarbonFootPrint() {
        if ("gasolina".equalsIgnoreCase(fueltype)) {
            return consumido * 2.3;
        } else if ("diesel".equalsIgnoreCase(fueltype)) {
            return consumido * 2.7;


        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Carro que consumiu %.2f litros de %s", consumido, fueltype);
    }

}

