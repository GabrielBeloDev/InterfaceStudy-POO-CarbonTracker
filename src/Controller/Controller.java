package Controller;

import Model.*;
import View.Display;

import java.util.ArrayList;

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


}
