package ua.lviv.iot.dwelling.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.dwelling.model.AbstractDwelling;
import ua.lviv.iot.dwelling.model.CityInfrastructure;

public class DwellingManager {

    private List<AbstractDwelling> dwellings;

    public DwellingManager() {
        dwellings = new LinkedList<AbstractDwelling>();
    }

    public void addDwelling(AbstractDwelling dwelling) {
        dwellings.add(dwelling);
    }

    public List<AbstractDwelling> formPropositions() {
        return dwellings;
    }

    public List<AbstractDwelling> formPropositionsByDistanceInMetersToAllBuildingsOfInfrastructure(
            double distanceInMeters, CityInfrastructure city) {
        List<AbstractDwelling> newListOfDwellings = new LinkedList<AbstractDwelling>();
        for (AbstractDwelling dwelling : dwellings) {
            if (dwelling.calculateDistanceToCloserSchoolInMeters(city.getLocationsOfSchools()) < distanceInMeters
                    && dwelling.calculateDistanceToCloserKindergardenInMeters(
                            city.getLocationsOfKindergardens()) < distanceInMeters
                    && dwelling.calculateDistanceToCloserPlaygroundInMeters(
                            city.getLocationsOfPlaygrounds()) < distanceInMeters) {
                newListOfDwellings.add(dwelling);
            }
        }
        return newListOfDwellings;
    }
}
