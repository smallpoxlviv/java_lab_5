package ua.lviv.iot.dwelling.model;

public class Mansion extends AbstractDwelling {

    private double areaOfLandInSquareMeters;
    private int entranceDoorCount;
    private boolean otherBuildingsInArea;

    public Mansion(double areaInSquareMeters, double priceInUSD, Location location, String district, int balconyCount) {
        super(areaInSquareMeters, priceInUSD, location, district, balconyCount);
    }

  /*  public String getHeaders() {
        return super.getHeaders() + ", " + "areaOfLandInSquareMeters, entranceDoorCount, otherBuildingsInArea";
    }*/

    public String toCSV() {
        return super.toCSV() + ";;;" + getAreaOfLandInSquareMeters() + ";" + getEntranceDoorCount() + ";"
                + isOtherBuildingsInArea();
    }

    public double getAreaOfLandInSquareMeters() {
        return areaOfLandInSquareMeters;
    }

    public void setAreaOfLandInSquareMeters(double areaOfLandInSquareMeters) {
        this.areaOfLandInSquareMeters = areaOfLandInSquareMeters;
    }

    public int getEntranceDoorCount() {
        return entranceDoorCount;
    }

    public void setEntranceDoorCount(int entranceDoorCount) {
        this.entranceDoorCount = entranceDoorCount;
    }

    public boolean isOtherBuildingsInArea() {
        return otherBuildingsInArea;
    }

    public void setOtherBuildingsInArea(boolean otherBuildingsInArea) {
        this.otherBuildingsInArea = otherBuildingsInArea;
    }
}
