package ua.lviv.iot.dwelling.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.dwelling.model.AbstractDwelling;
import ua.lviv.iot.dwelling.model.CityInfrastructure;

class DwellingManagerTest extends BaseDwellingManagerTest {

	private DwellingManager dwellingManager;
	private CityInfrastructure city;

	@BeforeEach
	public void setUp() {
		dwellingManager = new DwellingManager();
		fillDwellingManager(dwellingManager);

		city = new CityInfrastructure();
		addInfrastructure(city);
	}

	@Test
	public void testFormingPropositionsByDistanceInMetersToAllBuildingsOfInfrastructure() {
		List<AbstractDwelling> acceptableDwellings = dwellingManager
				.formPropositionsByDistanceInMetersToAllBuildingsOfInfrastructure(2000.0, city);
		assertEquals(acceptableDwellings.get(0).getLocation().getXInDecimalDegrees(),
				comparableListOfDwellings.get(0).getLocation().getXInDecimalDegrees());
		assertEquals(acceptableDwellings.get(1).getLocation().getXInDecimalDegrees(),
				comparableListOfDwellings.get(2).getLocation().getXInDecimalDegrees());
	}

	@Test
	public void testFormingPropositions() {
		List<AbstractDwelling> acceptableDwellings = dwellingManager.formPropositions();
		assertEquals(acceptableDwellings.get(0).getLocation().getXInDecimalDegrees(),
				comparableListOfDwellings.get(0).getLocation().getXInDecimalDegrees());
		assertEquals(acceptableDwellings.get(0).getLocation().getYInDecimalDegrees(),
				comparableListOfDwellings.get(0).getLocation().getYInDecimalDegrees());
		assertEquals(acceptableDwellings.get(1).getLocation().getXInDecimalDegrees(),
				comparableListOfDwellings.get(1).getLocation().getXInDecimalDegrees());
		assertEquals(acceptableDwellings.get(1).getLocation().getYInDecimalDegrees(),
				comparableListOfDwellings.get(1).getLocation().getYInDecimalDegrees());
		assertEquals(acceptableDwellings.get(2).getLocation().getXInDecimalDegrees(),
				comparableListOfDwellings.get(2).getLocation().getXInDecimalDegrees());
		assertEquals(acceptableDwellings.get(2).getLocation().getYInDecimalDegrees(),
				comparableListOfDwellings.get(2).getLocation().getYInDecimalDegrees());
		assertEquals(acceptableDwellings.get(3).getLocation().getXInDecimalDegrees(),
				comparableListOfDwellings.get(3).getLocation().getXInDecimalDegrees());
		assertEquals(acceptableDwellings.get(3).getLocation().getYInDecimalDegrees(),
				comparableListOfDwellings.get(3).getLocation().getYInDecimalDegrees());

	}

}
