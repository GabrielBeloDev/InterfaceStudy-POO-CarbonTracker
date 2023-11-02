package Model;

public class Car implements CarbonFootprint, Comparable<Car>{
    private String fueltype;

    private double consumido;
    private double pegadaDeCarbonoPorHora;

    public Car(String fueltype, double consumido,double pegadaDeCarbonoPorHora) {
        this.fueltype = fueltype;
        this.consumido = consumido;
        this.pegadaDeCarbonoPorHora = pegadaDeCarbonoPorHora;
    }

    public double getPegadaDeCarbonoPorHora(){
        return pegadaDeCarbonoPorHora;
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
    @Override
    public int compareTo(Car obj){
        return Double.compare(obj.pegadaDeCarbonoPorHora,this.pegadaDeCarbonoPorHora);
    }





}
