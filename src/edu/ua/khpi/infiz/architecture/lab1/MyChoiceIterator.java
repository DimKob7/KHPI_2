package edu.ua.khpi.infiz.architecture.lab1;

import java.util.List;

public class MyChoiceIterator implements TouristPlaceIterator {
    private List<TouristPlace> places;
    private int position = 0;

    public MyChoiceIterator(List<TouristPlace> places) {
        this.places = places;
    }

    @Override
    public boolean hasNext() {
        return position < places.size();
    }

    @Override
    public Object next() {
        TouristPlace place = places.get(position);
        position++;
        return place;
    }

}
