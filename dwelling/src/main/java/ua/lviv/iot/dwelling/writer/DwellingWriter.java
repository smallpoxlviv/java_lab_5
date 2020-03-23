package ua.lviv.iot.dwelling.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.dwelling.model.AbstractDwelling;

public class DwellingWriter {

    private Writer csvWriter;

    public void setCsvWriter(Writer csvWriter) {
        this.csvWriter = csvWriter;
    }

    public void writeToFile(List<AbstractDwelling> dwellings) throws IOException {
        csvWriter.write(dwellings.get(0).getHeaders());
        csvWriter.write("\r\n");
        for (AbstractDwelling dwelling : dwellings) {
            csvWriter.write(dwelling.toCSV());
            csvWriter.write("\r\n");
            csvWriter.flush();
        }
    }
}
