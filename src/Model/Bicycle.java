package Model;

public class Bicycle implements CarbonFootprint {
    private String material;

    public Bicycle(String material) {
        this.material = material;
    }

    @Override
    public double getCarbonFootPrint() {
        return 5 ;
    }

    public String toString() {
        return "bicicleta feita de " + material ;
    }
}
