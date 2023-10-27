package View;

import Model.CarbonFootprint;

public class Display {
    public static void showPegadadeCarbono(CarbonFootprint obj) {
        System.out.println(( obj.toString()));
        System.out.printf("Pegada de Carbono: %.2f kg de CO2%n", obj.getCarbonFootPrint());
        System.out.println();


    }
}
