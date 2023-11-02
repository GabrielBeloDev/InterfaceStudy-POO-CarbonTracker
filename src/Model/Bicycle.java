package Model;

public class Bicycle implements CarbonFootprint,Comparable<Bicycle> {
    private String material;
    private double pegadaDeCarbonoPorHora;

    public Bicycle(String material, double pegadaDeCarbonoPorHora) {
        this.material = material;
        this.pegadaDeCarbonoPorHora = pegadaDeCarbonoPorHora;
    }
    public double getPegadaDeCarbonoPorHora(){
        return pegadaDeCarbonoPorHora;
    }

    @Override
    public double getCarbonFootPrint() {
        return 5 ;
    }

    public String toString() {
        return "bicicleta feita de " + material ;
    }


    @Override
    public int compareTo(Bicycle obj) {
        return Double.compare(obj.pegadaDeCarbonoPorHora, this.pegadaDeCarbonoPorHora);
    }
}