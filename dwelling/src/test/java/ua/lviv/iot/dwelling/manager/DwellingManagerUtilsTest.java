package ua.lviv.iot.dwelling.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.dwelling.model.SortType;

public class DwellingManagerUtilsTest extends BaseDwellingManagerTest {

    @BeforeEach
    public void setUp() {
        createMansions();
    }

    @Test
    public void testSortingDescendingBySquare() {
        DwellingManagerUtils.sortByArea(mansions, SortType.DESC);
        assertEquals(108.3, mansions.get(0).getAreaInSquareMeters());
        assertEquals(100, mansions.get(1).getAreaInSquareMeters());
        assertEquals(45.2, mansions.get(2).getAreaInSquareMeters());
        assertEquals(18.5, mansions.get(3).getAreaInSquareMeters());
    }

    @Test
    public void testSortingAscendingBySquare() {
        DwellingManagerUtils.sortByArea(mansions, SortType.ASC);
        assertEquals(18.5, mansions.get(0).getAreaInSquareMeters());
        assertEquals(45.2, mansions.get(1).getAreaInSquareMeters());
        assertEquals(100, mansions.get(2).getAreaInSquareMeters());
        assertEquals(108.3, mansions.get(3).getAreaInSquareMeters());
    }

    @Test
    public void testSortingDescendingByPrice() {
        DwellingManagerUtils.sortByPrice(mansions, SortType.DESC);
        assertEquals(55000, mansions.get(0).getPriceInUSD());
        assertEquals(55000, mansions.get(1).getPriceInUSD());
        assertEquals(51000, mansions.get(2).getPriceInUSD());
        assertEquals(46000, mansions.get(3).getPriceInUSD());
    }

    @Test
    public void testSortingAscendingByPrice() {
        DwellingManagerUtils.sortByPrice(mansions, SortType.ASC);
        assertEquals(46000, mansions.get(0).getPriceInUSD());
        assertEquals(51000, mansions.get(1).getPriceInUSD());
        assertEquals(55000, mansions.get(2).getPriceInUSD());
        assertEquals(55000, mansions.get(3).getPriceInUSD());
    }

    @Test
    public void testSortingDescendingByPriceAndArea() {
        DwellingManagerUtils.sortByPriceAndArea(mansions, SortType.DESC);
        assertEquals(55000, mansions.get(0).getPriceInUSD());
        assertEquals(55000, mansions.get(1).getPriceInUSD());
        assertEquals(51000, mansions.get(2).getPriceInUSD());
        assertEquals(46000, mansions.get(3).getPriceInUSD());

        assertEquals(100, mansions.get(0).getAreaInSquareMeters());
        assertEquals(45.2, mansions.get(1).getAreaInSquareMeters());
    }

    @Test
    public void testSortingAscendingByPriceAndArea() {
        DwellingManagerUtils.sortByPriceAndArea(mansions, SortType.ASC);
        assertEquals(46000, mansions.get(0).getPriceInUSD());
        assertEquals(51000, mansions.get(1).getPriceInUSD());
        assertEquals(55000, mansions.get(2).getPriceInUSD());
        assertEquals(55000, mansions.get(3).getPriceInUSD());

        assertEquals(45.2, mansions.get(2).getAreaInSquareMeters());
        assertEquals(100, mansions.get(3).getAreaInSquareMeters());
    }

    @Test
    public void testSortingDescendingByDistrict() {
        DwellingManagerUtils.sortByPriceAndArea(mansions, SortType.DESC);
        assertEquals("Zaliznychni", mansions.get(0).getDistrict());
        assertEquals("Syhivski", mansions.get(1).getDistrict());
        assertEquals("Shevchenkivski", mansions.get(2).getDistrict());
        assertEquals("Frankivski", mansions.get(3).getDistrict());
    }

    @Test
    public void testSortingAscendingByDistrict() {
        DwellingManagerUtils.sortByPriceAndArea(mansions, SortType.ASC);
        assertEquals("Frankivski", mansions.get(0).getDistrict());
        assertEquals("Shevchenkivski", mansions.get(1).getDistrict());
        assertEquals("Syhivski", mansions.get(2).getDistrict());
        assertEquals("Zaliznychni", mansions.get(3).getDistrict());
    }
}
