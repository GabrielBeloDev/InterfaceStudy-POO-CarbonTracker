
package Controller;

import Model.*;
import View.Display;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Controller {
    private ArrayList<CarbonFootprint> carbonFootprintlist = new ArrayList<>();


    public void addObject(CarbonFootprint obj){
        carbonFootprintlist.add(obj);
    }

    public void displayCarbonFootprints(){
        for(CarbonFootprint obj : carbonFootprintlist){
            Display.showPegadadeCarbono(obj);
        }
    }


    public void ordenarCarbonFootprints(){
        Collections.sort(carbonFootprintlist, new Comparator<CarbonFootprint>() {
            @Override
            public int compare(CarbonFootprint o1, CarbonFootprint o2) {
                return Double.compare(o2.getPegadaDeCarbonoPorHora(), o1.getPegadaDeCarbonoPorHora());
            }
        });
    }


}