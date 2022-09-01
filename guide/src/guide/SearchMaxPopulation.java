package guide;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;


public class SearchMaxPopulation {
    public static void SearchMaxPopulation(){
    ArrayList<City> listOfCities = new ArrayList<>();
    listOfCities = Guide.getGuide();
    City[] array = new City[listOfCities.size()];
    int index=0;
    for(City city:listOfCities) {
        array[index]=city;
        index++;
    }
    int maxPopulation = 0;
    int maxIndex = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i].getPopulation() > maxPopulation) {
            maxPopulation = array[i].getPopulation();
            maxIndex = i;
        }
    }
    System.out.println("["+maxIndex+"] = " + maxPopulation);
    }
}
