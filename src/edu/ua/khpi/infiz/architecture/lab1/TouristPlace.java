package edu.ua.khpi.infiz.architecture.lab1;

public class TouristPlace {

        private String name;
        private String location;

        public TouristPlace(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        @Override
        public String toString() {
            return "TouristPlace{" +
                    "name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }
    }
