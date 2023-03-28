package edu.ua.khpi.infiz.architecture.lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<TouristPlace> places = new ArrayList<>();
        places.add(new TouristPlace("Park Gorkiy in Kharkiv", "recommended"));
        places.add(new TouristPlace("Andriyvskiy uzviz in Kiev", "recommended"));
        places.add(new TouristPlace("Sea port in Odessa", "local guide recommended"));
        System.out.println(places);

    }
}
