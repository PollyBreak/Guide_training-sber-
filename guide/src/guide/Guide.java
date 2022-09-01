package guide;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Guide {
    public static ArrayList<City> getGuide() {
        File textGuide = new File("Задача ВС Java Сбер.csv");
        String[] cityFields = new String[6];
        ArrayList<City> listOfCities = new ArrayList<>();
        try{
        Scanner scanner = new Scanner(textGuide);
            while(scanner.hasNextLine()){
                String newLine = scanner.nextLine();
                cityFields = newLine.split(";");
                City city = new City(cityFields);
                listOfCities.add(city);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return listOfCities;
    }
}

class City {
//private final String id;
private String name;
private String region;
private String district;
int population;
private String foundation;

City(String[] fields){
    //id = fields[0];
    name = fields[1];
    region = fields[2];
    district = fields[3];
    population = Integer.parseInt(fields[4]);
    if (fields.length == 6) {
        foundation = fields[5];
    }
}

public String getName() {
    return name;
}

public String getRegion() {
    return region;
}

public String getDistrict() {
    return district;
}

public int getPopulation() {
    int copy = population;
    return copy;
}

public String toString() {
    String output = "City{name='"+name
           +"',region='"+region
           +"',district='"+district
           +"',population="+population;
    if (this.foundation == null) {
        output +="}";
    }
    else {
        output +=",foundation='"+foundation+"'}";
    }
    return output;
}
}

class View{
    public static String listToString(ArrayList<?> list){
        String result ="";
         for (int i = 0; i < list.size()-1; i++) {
        result += list.get(i).toString()+"\n\n";
        }
        result += list.get(list.size()-1);
        return result;
    }
}