package workspace.mil.matmon.data.exercise.sampler.parser.parserExample;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import workspace.mil.matmon.data.exercise.sampler.parser.Parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser extends Parser {
    @Override
    public List<String[]> read(String path) throws IOException, CsvValidationException {
        List<String[]> newFile = new ArrayList<String[]>();

        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] lineInArray;
            while ((lineInArray = reader.readNext()) != null) {
                newFile.add(lineInArray);
            }
        }

        return newFile;
    }
}
