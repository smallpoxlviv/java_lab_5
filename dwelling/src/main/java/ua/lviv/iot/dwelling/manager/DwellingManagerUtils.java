package ua.lviv.iot.dwelling.manager;

import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.dwelling.model.AbstractDwelling;
import ua.lviv.iot.dwelling.model.SortType;

public class DwellingManagerUtils {

    private static final DwellingSorterByPrice DWELLING_BY_PRICE_SORTER = new DwellingSorterByPrice();

    private static final DwellingSorterByArea DWELLING_BY_AREA_SORTER = new DwellingManagerUtils().new DwellingSorterByArea();

    public static void sortByArea(List<AbstractDwelling> dwellings, SortType sortType) {
        dwellings.sort(sortType == SortType.ASC ? DWELLING_BY_AREA_SORTER : DWELLING_BY_AREA_SORTER.reversed());
    }

    public static void sortByPrice(List<AbstractDwelling> dwellings, SortType sortType) {
        dwellings.sort(sortType == SortType.ASC ? DWELLING_BY_PRICE_SORTER : DWELLING_BY_PRICE_SORTER.reversed());
    }

    public static void sortByPriceAndArea(List<AbstractDwelling> dwellings, SortType sortType) {
        Comparator<AbstractDwelling> comparator = new Comparator<AbstractDwelling>() {
            @Override
            public int compare(AbstractDwelling firstDwelling, AbstractDwelling secondDwelling) {
                double priceComparisonResult = firstDwelling.getPriceInUSD() - secondDwelling.getPriceInUSD();
                if (priceComparisonResult != 0) {
                    return (int) priceComparisonResult;
                } else {
                    return (int) (firstDwelling.getAreaInSquareMeters() - secondDwelling.getAreaInSquareMeters());
                }
            }
        };
        dwellings.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
    }

    public static void sortByDistrict(List<AbstractDwelling> dwellings, SortType sortType) {
        dwellings.sort(sortType == SortType.ASC
                ? (AbstractDwelling firstDwelling, AbstractDwelling secondDwelling) -> firstDwelling.getDistrict()
                        .compareTo(secondDwelling.getDistrict())
                : (AbstractDwelling firstDwelling, AbstractDwelling secondDwelling) -> secondDwelling.getDistrict()
                        .compareTo(firstDwelling.getDistrict()));
    }

    class DwellingSorterByArea implements Comparator<AbstractDwelling> {
        @Override
        public int compare(AbstractDwelling firstDwelling, AbstractDwelling secondDwelling) {
            return (int) (firstDwelling.getAreaInSquareMeters() - secondDwelling.getAreaInSquareMeters());
        }
    }

    static class DwellingSorterByPrice implements Comparator<AbstractDwelling> {
        @Override
        public int compare(AbstractDwelling firstDwelling, AbstractDwelling secondDwelling) {
            return (int) (firstDwelling.getPriceInUSD() - secondDwelling.getPriceInUSD());
        }
    }

}
