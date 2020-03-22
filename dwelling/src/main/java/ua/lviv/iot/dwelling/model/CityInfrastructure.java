package ua.lviv.iot.dwelling.model;

import java.util.LinkedList;
import java.util.List;

public class CityInfrastructure {
    private List<Location> locationsOfSchools;
    private List<Location> locationsOfKindergardens;
    private List<Location> locationsOfPlaygrounds;

    public CityInfrastructure() {
        setLocationsOfSchools(new LinkedList<Location>());
        setLocationsOfKindergardens(new LinkedList<Location>());
        setLocationsOfPlaygrounds(new LinkedList<Location>());
    }

    public void addSchool(double xInDecimalDegrees, double yInDecimalDegrees) {
        locationsOfSchools.add(new Location(xInDecimalDegrees, yInDecimalDegrees));
    }

    public void addKindergarden(double xInDecimalDegrees, double yInDecimalDegrees) {
        locationsOfKindergardens.add(new Location(xInDecimalDegrees, yInDecimalDegrees));
    }

    public void addPlayground(double xInDecimalDegrees, double yInDecimalDegrees) {
        locationsOfPlaygrounds.add(new Location(xInDecimalDegrees, yInDecimalDegrees));
    }

    public List<Location> getLocationsOfSchools() {
        return locationsOfSchools;
    }

    public void setLocationsOfSchools(List<Location> locationsOfSchools) {
        this.locationsOfSchools = locationsOfSchools;
    }

    public List<Location> getLocationsOfKindergardens() {
        return locationsOfKindergardens;
    }

    public void setLocationsOfKindergardens(List<Location> locationsOfKindergardens) {
        this.locationsOfKindergardens = locationsOfKindergardens;
    }

    public List<Location> getLocationsOfPlaygrounds() {
        return locationsOfPlaygrounds;
    }

    public void setLocationsOfPlaygrounds(List<Location> locationsOfPlaygrounds) {
        this.locationsOfPlaygrounds = locationsOfPlaygrounds;
    }

}
