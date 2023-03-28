package edu.ua.khpi.infiz.architecture.lab1;

import java.util.List;

public class NavigatorIterator implements TouristPlaceIterator{
    private List<TouristPlace> places;
    private int position = 0;

    public NavigatorIterator(List<TouristPlace> places) {
        this.places = places;
    }

    @Override
    public boolean hasNext() {
        while (position < places.size()) {
            TouristPlace place = places.get(position);
            if (place.getLocation().equals("recommended")) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Object next() {
        TouristPlace place = places.get(position);
        position++;
        return place;
    }
}
