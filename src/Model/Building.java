package Model;

public class Building implements CarbonFootprint {
    private double consumo;
    private String fuelType;

    public Building(double consumo, String fuelType) {
        this.consumo = consumo;
        this.fuelType = fuelType;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double getCarbonFootPrint() {
        if ("gas".equalsIgnoreCase(fuelType)) {
            return consumo * 2.2;
        } else if ("eletricidade".equalsIgnoreCase(fuelType)) {
            return consumo * 0.5;

        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return String.format("Edifício com consumo de %.2f m² e tipo de combustível '%s'", consumo, fuelType);
    }

}
