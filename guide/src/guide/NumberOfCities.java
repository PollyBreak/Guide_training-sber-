package guide;
import java.util.ArrayList;
import java.util.HashMap;

public class NumberOfCities {
    public static void main(String[] args) {
        ArrayList<City> listOfCities = new ArrayList<>();
        listOfCities = Guide.getGuide();
        HashMap <String, Integer> regions = new HashMap<>();
        for(City city: listOfCities){
            if (!regions.containsKey(city.getRegion())) {
                regions.put(city.getRegion(),1);
            }
            else {
                regions.put(city.getRegion(), regions.get(city.getRegion())+1);
            }
        }
        regions.forEach((key,value) -> System.out.println(key + " - " + value));
    }
}
