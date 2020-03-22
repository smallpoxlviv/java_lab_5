package ua.lviv.iot.dwelling.model;

public class Location {
    private double xInDecimalDegrees;
    private double yInDecimalDegrees;

    public Location(double xInDecimalDegrees, double yInDecimalDegrees) {
        this.xInDecimalDegrees = xInDecimalDegrees;
        this.yInDecimalDegrees = yInDecimalDegrees;
    }

    public double getXInDecimalDegrees() {
        return xInDecimalDegrees;
    }

    public void setXInDecimalDegrees(double xInDecimalDegrees) {
        this.xInDecimalDegrees = xInDecimalDegrees;
    }

    public double getYInDecimalDegrees() {
        return yInDecimalDegrees;
    }

    public void setYInDecimalDegrees(double yInDecimalDegrees) {
        this.yInDecimalDegrees = yInDecimalDegrees;
    }
}
