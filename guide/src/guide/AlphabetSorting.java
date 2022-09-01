package guide;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;


public class AlphabetSorting {
    public void SortCities(){
        ArrayList<City> listOfCities = new ArrayList<>();
        listOfCities = Guide.getGuide();
        System.out.println("Введите"
                + "\n 1-для сортировки по наименованию городов"
                + "\n 2-для сортировки по федеральному округу и наименованию городов");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();
        if (!input.equals("1") && !input.equals("2")){
        System.out.println("Ошибка! Вы ввели не 1 или 2");
        }
        else {
            int button = Integer.parseInt(input);
            if (button == 1) {
                listOfCities.sort(
                Comparator.comparing(City::getName, String.CASE_INSENSITIVE_ORDER)
                );
            } 
            else {
                listOfCities.sort(
                Comparator.comparing(City::getDistrict).thenComparing(City::getName)
                );
            }
            System.out.println(View.listToString(listOfCities));
        }
    }
}


