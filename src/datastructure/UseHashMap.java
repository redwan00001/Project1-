package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("First Name:", "John");
        personalInfo.put("Last Name:", "Doe");
        personalInfo.put("CellPhone:", "3477710951");
        personalInfo.put("Email Address:", "redwanalam98@gmail.com");

        System.out.println(personalInfo.get("CellPhone"));
        for (Map.Entry entry : personalInfo.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

            List<String> citiesOfUSA = new ArrayList<>();
            citiesOfUSA.add("NYC");
            citiesOfUSA.add("LA");
            citiesOfUSA.add("Miami");

            List<String> citiesOfCanada = new ArrayList<>();
            citiesOfCanada.add("Toronto");
            citiesOfCanada.add("Montreal");
            citiesOfCanada.add("Ottawa");

            List<String> citiesOfEngland = new ArrayList<>();
            citiesOfEngland.add("London");
            citiesOfEngland.add("Manchester");
            citiesOfEngland.add("Leeds");

            Map<String, List<String>> map = new HashMap<>();
            map.put("USA", citiesOfUSA);
            map.put("Canada", citiesOfCanada);
            map.put("England", citiesOfEngland);

            System.out.println(map.get("USA"));
            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }


    }
}