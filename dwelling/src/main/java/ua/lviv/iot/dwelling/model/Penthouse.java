package ua.lviv.iot.dwelling.model;

public class Penthouse extends AbstractDwellingInHouse {

    public Penthouse(double areaInSquareMeters, double priceInUSD, Location location, String district,
            int balconyCount) {
        super(areaInSquareMeters, priceInUSD, location, district, balconyCount);
    }
}
