package ua.lviv.iot.dwelling.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.dwelling.model.AbstractDwelling;
import ua.lviv.iot.dwelling.model.Location;
import ua.lviv.iot.dwelling.model.Mansion;

class DwellingWriterTest {

    List<AbstractDwelling> dwellings;
    String comparableText = "areaInSquareMeters, priceInUSD, location, SoundInsulationOfWalls, district, "
            + "allRoomsCount, balconyCount, kitchenCount, restroomCount, floorCount, windowsCount, poolAvability, "
            + "garageAvability, areaOfLandInSquareMeters, entranceDoorCount, otherBuildingsInArea, 45.2, 55000.0, "
            + "\"49.838883, 24.027453\", null, Syhivski, 0, 0, 0, 0, 0, 0, false, false, 0.0, 0, false\r\n"
            + "areaInSquareMeters, priceInUSD, location, SoundInsulationOfWalls, district, allRoomsCount, balconyCount, "
            + "kitchenCount, restroomCount, floorCount, windowsCount, poolAvability, garageAvability, "
            + "areaOfLandInSquareMeters, entranceDoorCount, otherBuildingsInArea, 18.5, 46000.0, "
            + "\"49.825672, 23.954481\", null, Frankivski, 0, 2, 0, 0, 0, 0, false, false, 0.0, 0, false\r\n" + "";

    @BeforeEach
    public void setUp() {
        dwellings = new LinkedList<AbstractDwelling>();
        dwellings.add(new Mansion(45.2, 55000, new Location(49.838883, 24.027453), "Syhivski", 0));
        dwellings.add(new Mansion(18.5, 46000, new Location(49.825672, 23.954481), "Frankivski", 2));
    }

    @Test
    void testProperWrite() {
        try (Writer fileWriter = new FileWriter("Dwellings.csv")) {
            DwellingWriter writer = new DwellingWriter();
            writer.setCsvWriter(fileWriter);
            writer.writeToFile(dwellings);
        } catch (Exception e) {
            fail("the test failed unexpectedly - try to write to the file .....");
        }
    }

    @Test
    void testProperTextFormatting() {
        try (Writer csvWriter = new StringWriter()) {
            DwellingWriter writer = new DwellingWriter();
            writer.setCsvWriter(csvWriter);
            writer.writeToFile(dwellings);
            assertEquals(comparableText, csvWriter.toString());
        } catch (Exception e) {
            fail("the test failed unexpectedly - try to write to the file .....");
        }
    }

}
