package ua.lviv.iot.dwelling.manager;

import java.util.LinkedList;

import java.util.List;

import ua.lviv.iot.dwelling.model.AbstractDwelling;
import ua.lviv.iot.dwelling.model.CityInfrastructure;
import ua.lviv.iot.dwelling.model.Mansion;
import ua.lviv.iot.dwelling.model.Location;

public abstract class BaseDwellingManagerTest {

    protected List<AbstractDwelling> mansions;
    protected List<AbstractDwelling> comparableListOfDwellings;

    public void createMansions() {
        mansions = new LinkedList<AbstractDwelling>();
        mansions.add(new Mansion(45.2, 55000, new Location(49.838883, 24.027453), "Syhivski", 0));
        mansions.add(new Mansion(18.5, 46000, new Location(49.825672, 23.954481), "Frankivski", 2));
        mansions.add(new Mansion(108.3, 51000, new Location(49.846594, 24.025002), "Shevchenkivski", 1));
        mansions.add(new Mansion(100, 55000, new Location(49.765081, 23.842558), "Zaliznychni", 1));
    }

    public void addInfrastructure(CityInfrastructure city) {
        city.addSchool(49.841863, 24.029012);
        city.addSchool(49.845661, 24.034215);
        city.addKindergarden(49.839290, 24.017122);
        city.addKindergarden(49.843367, 24.009523);
        city.addPlayground(49.843816, 24.035229);
        city.addPlayground(49.839023, 24.019074);
    }

    public void fillDwellingManager(DwellingManager dwellingManager) {
        comparableListOfDwellings = new LinkedList<AbstractDwelling>();
        comparableListOfDwellings.add(new Mansion(45.2, 52000, new Location(49.838883, 24.027453), "Syhivski", 0));
        comparableListOfDwellings.add(new Mansion(18.5, 46000, new Location(49.825672, 23.954481), "Frankivski", 2));
        comparableListOfDwellings
                .add(new Mansion(108.3, 51000, new Location(49.846594, 24.025002), "Shevchenkivski", 1));
        comparableListOfDwellings.add(new Mansion(100, 55000, new Location(49.765081, 23.842558), "Zaliznychni", 1));

        dwellingManager.addDwelling(comparableListOfDwellings.get(0));
        dwellingManager.addDwelling(comparableListOfDwellings.get(1));
        dwellingManager.addDwelling(comparableListOfDwellings.get(2));
        dwellingManager.addDwelling(comparableListOfDwellings.get(3));
    }

}
